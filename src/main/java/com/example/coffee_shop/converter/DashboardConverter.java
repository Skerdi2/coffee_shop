package com.example.coffee_shop.converter;

import com.example.coffee_shop.dto.DashboardDTO;
import com.example.coffee_shop.model.Dashboard;

public class DashboardConverter {

    public static DashboardDTO toDTO(Dashboard dashboard){
        DashboardDTO dashboardDTO = new DashboardDTO();
        dashboardDTO.setDate(dashboard.getDate());
        dashboardDTO.setTotal_customers(dashboard.getTotal_customers());
        dashboardDTO.setTotal_rev(dashboard.getTotal_rev());
        return dashboardDTO;
    }

    public static Dashboard toEntity(DashboardDTO dashboardDTO){
        Dashboard dashboard = new Dashboard();
        dashboard.setDate(dashboardDTO.getDate());
        dashboard.setTotal_customers(dashboardDTO.getTotal_customers());
        dashboard.setTotal_rev(dashboardDTO.getTotal_rev());
        return dashboard;
    }

    public static Dashboard toEntityForUpdate(DashboardDTO dashboardDTO, Dashboard dashboard){
        dashboard.setDate(dashboardDTO.getDate());
        dashboard.setTotal_customers(dashboardDTO.getTotal_customers());
        dashboard.setTotal_rev(dashboardDTO.getTotal_rev());
        return dashboard;
    }
}
