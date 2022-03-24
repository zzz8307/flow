package cn.rc.flow.web.service.impl;

import cn.rc.flow.common.properties.NumberingProperties;
import cn.rc.flow.dao.NumberMapper;
import cn.rc.flow.domain.Number;
import cn.rc.flow.domain.NumberExample;
import cn.rc.flow.web.service.NumberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author rc
 */
@Service
public class NumberServiceImpl implements NumberService {

    public static final String DEFAULT_PREFIX = "";
    public static final Integer DEFAULT_MAXIMUM_DIGITS = 7;
    public static final Integer DEFAULT_START_NUMBER = 7;

    @Resource
    private NumberMapper numberMapper;

    @Resource
    private NumberingProperties numberingProperties;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public String getNextNumber(String tableName, String updatedBy) {
        int retryCount = 0;
        boolean retryable;

        do {
            // get the counter for current table
            NumberExample numberExample = new NumberExample();
            numberExample.createCriteria()
                    .andTableNameEqualTo(tableName);
            List<Number> numberList = numberMapper.selectByExample(numberExample);
            Number numberObj = numberList.get(0);

            String prefix = numberObj.getPrefix();
            Integer maximumDigits = numberObj.getMaximumDigits();
            // counter + 1
            Integer nextNumber = numberObj.getNumber() + 1;
            Integer currentModCount = numberObj.getSysModCount();

            numberObj.setNumber(nextNumber);
            numberObj.setUpdatedTime(new Date());
            numberObj.setSysModCount(currentModCount + 1);

            NumberExample nextNumberExample = new NumberExample();
            nextNumberExample.createCriteria()
                    .andSysIdEqualTo(numberObj.getSysId())
                    .andSysModCountEqualTo(currentModCount);

            int updated = numberMapper.updateByExampleSelective(numberObj, nextNumberExample);

            if (updated == 1) {
                return String.format(prefix + "%0" + maximumDigits + "d", numberObj.getNumber());
            }

            retryable = numberingProperties.getEnforceUniqueNumber()
                    || ++retryCount < numberingProperties.getMaxRetries();
        } while (retryable);

        // failed to get next number, set transaction status to rollback and return null
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        return null;
    }
}
