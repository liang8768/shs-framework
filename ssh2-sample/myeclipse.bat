@echo off
echo [INFO] Use maven eclipse plugin download jar and generate eclipse project files.
echo [INFO] Please add "-Declipse.workspace=<path-to-eclipse-workspace>" at end of follow command.

%~d0
cd %~dp0
call mvn eclipse:myeclipse-clean eclipse:myeclipse

pause