package com.example.coffee_shop.services.implementation;

import com.example.coffee_shop.converter.BillConverter;
import com.example.coffee_shop.dto.BillDTO;
import com.example.coffee_shop.exceptions.NotFoundException;
import com.example.coffee_shop.model.Bill;
import com.example.coffee_shop.repository.BillRepository;
import com.example.coffee_shop.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BIllServImpl implements BillService {

    @Autowired
    BillRepository billRepository;

    @Override
    public void save(BillDTO billDTO) {
        Bill bill = BillConverter.toEntity(billDTO);
        billRepository.save(bill);
    }


    @Override
    public void update(BillDTO billDTO) {
        Bill bill = billRepository.findById(billDTO.getBill_id())
                .orElseThrow(() -> new NotFoundException("Bill nuk gjendet!"));
        billRepository.save(BillConverter.toEntityForUpdate(billDTO,bill));
    }

    @Override
    public BillDTO findById(Integer id) {
        return BillConverter.toDTO(billRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Bill nuk u gjet")));
    }
}
