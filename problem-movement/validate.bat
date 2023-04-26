@echo off

set /p finalResult="Please, enter your final result in 123,456 format: "

certutil -decode ./result.b64 ./result.tmp > nul
set /p referenceResult=<result.tmp
del result.tmp

if "%finalResult%" == "%referenceResult%" (echo Correct!) else (echo Incorrect!)

