package com.company.View;

import com.company.App.Admin;
import com.company.Controller.AdminController;
import com.company.MVC.View;

import java.time.DayOfWeek;

public class AdminView implements View {

    private Admin admin;
    private AdminController adminController;

    public AdminView(Admin admin, AdminController adminController) {
        this.admin = admin;
        this.adminController = adminController;
        admin.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {

    }
}
