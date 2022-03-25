# flow

ITSM system backend API. RESTful API design (level 2).

Implemented modules: Incident Management & Problem Management.

## Usage

Example:

### Get the authenticated user:

```
GET http://<hostname>/flow/api/current
```

**Parameters:**

| Name          | Type    | In   | Description                                                                                                           |
| ------------- | ------- | ---- | --------------------------------------------------------------------------------------------------------------------- |
| display_value | boolean | path | Determines the type of data returned, either the actual values from the database or the display values of the fields. |

**Response:**

```
200 OK
```
```
401 Unauthorized
```

### Update the authenticated user:

```
PATCH http://<hostname>/flow/api/current
```

**Parameters:**

| Name             | Type    | In   | Description                                                                                                           |
| ---------------- | ------- | ---- | --------------------------------------------------------------------------------------------------------------------- |
| display_value    | boolean | path | Determines the type of data returned, either the actual values from the database or the display values of the fields. |
| name-value pairs | string  | body | Field name and the associated value for each parameter to define in the specified record.                             |

**Response:**

```
200 OK
```
```
401 Unauthorized
```
```
500 Internal Server Error
```

### List Incidents:

```
GET http://<hostname>/flow/api/incidents
```

**Parameters:**

| Name          | Type    | In   | Description                                                                                                           |
| ------------- | ------- | ---- | --------------------------------------------------------------------------------------------------------------------- |
| display_value | boolean | path | Determines the type of data returned, either the actual values from the database or the display values of the fields. |
| query         | string  | path | Encoded query used to filter the result set. See [below](#query-syntax) for more details.                             |
| offset        | integer | path | Starting record index for which to begin retrieving records. Default is 0.                                            |
| limit         | integer | path | Maximum number of records to return. Default is 100.                                                                  |

**Response:**

```
200 OK
```

### Get an incident record:

```
GET http://<hostname>/flow/api/incidents/{id}
```

**Parameters:**

| Name          | Type    | In   | Description                                                                                                           |
| ------------- | ------- | ---- | --------------------------------------------------------------------------------------------------------------------- |
| display_value | boolean | path | Determines the type of data returned, either the actual values from the database or the display values of the fields. |

**Response:**

```
200 OK
```
```
404 Not Found
```

### Create an incident record:

```
POST http://<hostname>/flow/api/incidents/
```

**Parameters:**

| Name             | Type    | In   | Description                                                                                                           |
| ---------------- | ------- | ---- | --------------------------------------------------------------------------------------------------------------------- |
| display_value    | boolean | path | Determines the type of data returned, either the actual values from the database or the display values of the fields. |
| name-value pairs | string  | body | Field name and the associated value for each parameter to define in the specified record.                             |

**Response:**

```
201 Created
```
```
400 Bad Request
```

### Update an incident record:

```
PATCH http://<hostname>/flow/api/incidents/{id}
```

**Parameters:**

| Name             | Type    | In   | Description                                                                                                           |
| ---------------- | ------- | ---- | --------------------------------------------------------------------------------------------------------------------- |
| display_value    | boolean | path | Determines the type of data returned, either the actual values from the database or the display values of the fields. |
| name-value pairs | string  | body | Field name and the associated value for each parameter to define in the specified record.                             |

**Response:**

```
200 OK
```
```
500 Internal Server Error
```

### Delete an incident record:

```
DELETE http://<hostname>/flow/api/incidents/{id}
```

**Parameters:**

None.

**Response:**

```
204 No Content
```
```
404 Not Found
```

## Query syntax

Encoded query used to filter the result set.

Syntax: `query=<field><operator><value>[<operator><field><operator><value>]`

operator: 
- `=`: Exactly matches &lt;value&gt;.
- `!=`: Does not match &lt;value&gt;.
- `LIKE`: Contains the specified string.
- `STARTSWITH`: Starts with the specified string.
- `ENDSWITH`: Ends with the specified string.
- `^`: Logically AND.
- `^OR`: Logically OR.
- `^ORDERBY`: Sort ascending.
- `^ORDERBYDESC`: Sort descending.
