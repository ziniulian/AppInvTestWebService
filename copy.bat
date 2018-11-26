@echo off
xcopy L:\Doc\SVN\Work\OtherAS\test\testWebService\app\src\main L:\Doc\Git\AppInvTestWebService\app\src\main\ /S
xcopy L:\Doc\SVN\Work\OtherAS\test\testWebService\app\libs L:\Doc\Git\AppInvTestWebService\app\libs\ /S
copy L:\Doc\SVN\Work\OtherAS\test\testWebService\app\build.gradle L:\Doc\Git\AppInvTestWebService\app
pause
