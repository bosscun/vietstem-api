
# Application

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**realm** | **String** |  |  [optional]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**icon** | **String** | The icon image url |  [optional]
**owner** | **String** | The user id of the developer who registers the application |  [optional]
**collaborators** | **List&lt;String&gt;** | A list of users ids who have permissions to work on this app |  [optional]
**email** | **String** |  |  [optional]
**emailVerified** | **Boolean** |  |  [optional]
**url** | **String** | The application URL for OAuth 2.0 |  [optional]
**callbackUrls** | **List&lt;String&gt;** | OAuth 2.0 code/token callback URLs |  [optional]
**permissions** | **List&lt;String&gt;** | A list of permissions required by the application |  [optional]
**clientKey** | **String** |  |  [optional]
**javaScriptKey** | **String** |  |  [optional]
**restApiKey** | **String** |  |  [optional]
**windowsKey** | **String** |  |  [optional]
**masterKey** | **String** |  |  [optional]
**pushSettings** | [**XAny**](XAny.md) |  |  [optional]
**authenticationEnabled** | **Boolean** |  |  [optional]
**anonymousAllowed** | **Boolean** |  |  [optional]
**authenticationSchemes** | [**List&lt;XAny&gt;**](XAny.md) |  |  [optional]
**status** | **String** | Status of the application, production/sandbox/disabled |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modified** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



