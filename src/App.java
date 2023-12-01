/*
* File: App.java
* Author: Nagy József
* Refactor: Szinyei Mikes
* Copyright: 2021, Nagy József
* Date: 2021-09-11
* Refactor Date: 2023-12-01
* Github: https://github.com/mikesszinyei
* Licenc: MIT
* 
*/

import controllers.MainController;import views.MainWindow;
public class App {
    public static void main(String[] args) throws Exception {
    MainWindow mainWindow = new MainWindow();
    new MainController(mainWindow);
    mainWindow.setVisible(true);
}}
