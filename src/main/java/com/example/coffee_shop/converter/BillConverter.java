package com.example.coffee_shop.converter;

import com.example.coffee_shop.dto.BillDTO;
import com.example.coffee_shop.model.Bill;

public class BillConverter {

    public static BillDTO toDTO(Bill bill){
        BillDTO billDTO = new BillDTO();
        billDTO.setBill_id(bill.getBill_id());
        billDTO.setPrice(bill.getPrice());
        billDTO.setLocation(bill.getLocation());
        billDTO.setDate_time(bill.getDate_time());
        billDTO.setTotal_ammount(bill.getTotal_ammount());
        return billDTO;
    }

    public static Bill toEntity(BillDTO billDTO){
        Bill bill = new Bill();
        bill.setPrice(billDTO.getPrice());
        bill.setLocation(billDTO.getLocation());
        bill.setDate_time(billDTO.getDate_time());
        bill.setTotal_ammount(billDTO.getTotal_ammount());
        return bill;
    }

    public static Bill toEntityForUpdate(BillDTO billDTO, Bill bill){
        bill.setPrice(billDTO.getPrice());
        bill.setLocation(billDTO.getLocation());
        bill.setDate_time(billDTO.getDate_time());
        bill.setTotal_ammount(billDTO.getTotal_ammount());
        return bill;
    }
}
