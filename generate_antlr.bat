@echo off
REM ANTLR Code Generator Script for Windows

echo ========================================
echo Generating ANTLR Lexer and Parser Files
echo ========================================

REM Check if ANTLR jar exists, if not download it
set ANTLR_JAR=antlr-4.13.2-complete.jar
if not exist "%ANTLR_JAR%" (
    echo Downloading ANTLR 4.13.2 complete jar...
    powershell -Command "Invoke-WebRequest -Uri 'https://www.antlr.org/download/antlr-4.13.2-complete.jar' -OutFile '%ANTLR_JAR%'"
    if errorlevel 1 (
        echo Failed to download ANTLR jar. Please download manually from:
        echo https://www.antlr.org/download/antlr-4.13.2-complete.jar
        echo Place it in the project root directory.
        pause
        exit /b 1
    )
)

REM Create output directory if it doesn't exist
if not exist "gen\gen" mkdir gen\gen

echo.
echo Generating Lexer_Python...
java -cp "%ANTLR_JAR%" org.antlr.v4.Tool -visitor -listener -o gen\gen -package gen grammar\Lexer_Python.g4
if errorlevel 1 (
    echo Failed to generate Lexer_Python
    pause
    exit /b 1
)

echo Generating Parser_Python...
java -cp "%ANTLR_JAR%" org.antlr.v4.Tool -visitor -listener -o gen\gen -package gen -lib gen\gen grammar\Parser_Python.g4
if errorlevel 1 (
    echo Failed to generate Parser_Python
    pause
    exit /b 1
)

echo Generating Lexer_HTML_Jinja_CSS...
java -cp "%ANTLR_JAR%" org.antlr.v4.Tool -visitor -listener -o gen\gen -package gen grammar\Lexer_HTML_Jinja_CSS.g4
if errorlevel 1 (
    echo Failed to generate Lexer_HTML_Jinja_CSS
    pause
    exit /b 1
)

echo Generating Parser_HTML_Jinja_CSS...
java -cp "%ANTLR_JAR%" org.antlr.v4.Tool -visitor -listener -o gen\gen -package gen -lib gen\gen grammar\Parser_HTML_Jinja_CSS.g4
if errorlevel 1 (
    echo Failed to generate Parser_HTML_Jinja_CSS
    pause
    exit /b 1
)

REM Move files from gen\gen\grammar to gen\gen if they were generated in a subdirectory
if exist "gen\gen\grammar" (
    echo Moving files from gen\gen\grammar to gen\gen...
    move /Y gen\gen\grammar\* gen\gen\
    rmdir gen\gen\grammar
)

echo.
echo ========================================
echo ANTLR Code Generation Complete!
echo ========================================
echo.
echo Generated files are in: gen\gen\
echo.
pause

