set projectLocation=C:\Automation\WorkSpace\Test- Git - Jenkins
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause