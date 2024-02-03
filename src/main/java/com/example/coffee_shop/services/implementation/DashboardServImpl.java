package com.example.coffee_shop.services.implementation;

import com.example.coffee_shop.converter.DashboardConverter;
import com.example.coffee_shop.dto.DashboardDTO;
import com.example.coffee_shop.exceptions.NotFoundException;
import com.example.coffee_shop.model.Dashboard;
import com.example.coffee_shop.repository.DashboardRepository;
import com.example.coffee_shop.services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServImpl implements DashboardService {

    @Autowired
    DashboardRepository dashboardRepository;

    @Override
    public void save(DashboardDTO dashboardDTO) {
        Dashboard dashboard = DashboardConverter.toEntity(dashboardDTO);
        dashboardRepository.save(dashboard);
    }


    @Override
    public void update(DashboardDTO dashboardDTO) {
        Dashboard dashboard = dashboardRepository.findById(dashboardDTO.getDashboard_id())
                .orElseThrow(() -> new NotFoundException("Dashboard nuk gjendet!"));
        dashboardRepository.save(DashboardConverter.toEntityForUpdate(dashboardDTO,dashboard));
    }

    @Override
    public DashboardDTO findById(Integer id) {
        return DashboardConverter.toDTO(dashboardRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Dashboard nuk u gjet")));
    }
}
