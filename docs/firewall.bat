@echo off
pushd "%~dp0"

>firewall-rule.bat cd.
for /l %%p in (10000,1,10400) do (
  >>firewall-rule.bat echo netsh http add urlacl "url=http://[::1]:%%p/" "user=%COMPUTERNAME%\%USERNAME%"
  >>firewall-rule.bat echo netsh http add urlacl "url=http://127.0.0.1:%%p/" "user=%COMPUTERNAME%\%USERNAME%"
  >>firewall-rule.bat echo netsh http add urlacl "url=http://localhost:%%p/" "user=%COMPUTERNAME%\%USERNAME%"
)
popd