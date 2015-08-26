;This file will be executed next to the application bundle image
;I.e. current directory will contain folder Nemcina vyukovy program with application files
[Setup]
SignTool=signtool
AppId=nemcina
AppName=Nìmèina výukový program
AppVersion=1.0
AppVerName=Nemcina vyukovy program 1.0
AppPublisher=Mgr. Anita Báchorová, Jakub Míl, Bc. Jan Vaòura
AppComments=Nemcina vyukovy program
AppCopyright=
AppPublisherURL=http://www.nemcina-vyukovy-program.cz
AppSupportURL=http://www.nemcina-vyukovy-program.cz/files/help.pdf
;AppUpdatesURL=http://java.com/
DefaultDirName={localappdata}\Nemcina vyukovy program
DisableStartupPrompt=Yes
DisableDirPage=No
DisableProgramGroupPage=Yes
DisableReadyPage=No
DisableFinishedPage=No
DisableWelcomePage=No
DefaultGroupName=Mgr. Anita Báchorová, Jakub Míl, Bc. Jan Vaòura
;Optional License
LicenseFile=
;WinXP or above
WizardImageFile=aside.bmp
MinVersion=0,5.1 
OutputBaseFilename=nemcina_vyukovy_program_instalace
Compression=lzma
SolidCompression=yes
PrivilegesRequired=lowest
SetupIconFile=Nemcina vyukovy program\nemcina_vyukovy_program.ico
UninstallDisplayIcon={app}\nemcina_vyukovy_program.ico
UninstallDisplayName=Nemcina vyukovy program
WizardImageStretch=No
WizardSmallImageFile=Nemcina vyukovy program-setup-icon.bmp   

[Languages]
Name: "czech"; MessagesFile: "compiler:Languages\Czech.isl"

[Files]
Source: "Nemcina vyukovy program\nemcina_vyukovy_program.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "Nemcina vyukovy program\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs

[Icons]
Name: "{group}\Nemcina vyukovy program"; Filename: "{app}\nemcina_vyukovy_program.exe"; IconFilename: "{app}\nemcina_vyukovy_program.ico"; Check: returnTrue()
Name: "{commondesktop}\Nemcina vyukovy program"; Filename: "{app}\nemcina_vyukovy_program.exe";  IconFilename: "{app}\nemcina_vyukovy_program.ico"; Check: returnTrue()

[Run]
Filename: "{app}\nemcina_vyukovy_program.exe"; Description: "{cm:LaunchProgram,Nemcina vyukovy program}"; Flags: nowait postinstall skipifsilent

[Code]
function returnTrue(): Boolean;
begin
  Result := True;
end;

function returnFalse(): Boolean;
begin
  Result := False;
end;

function InitializeSetup(): Boolean;
begin
// Possible future improvements:
//   if version less or same => just launch app
//   if upgrade => check if same app is running and wait for it to exit
//   Add pack200/unpack200 support? 
  Result := True;
end;  
