import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

response = WS.sendRequest(findTestObject('GET/GET single user'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'data.email', 'janet.weaver@reqres.in')

