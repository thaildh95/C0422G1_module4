package com.casestudy.repository.contract;

import com.casestudy.dto.ContractPage;
import com.casestudy.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface IContractRepository extends JpaRepository<Contract,Integer> {
    @Query(value = "select\n" +
            " d.facility_name as facility,\n" +
            " k.name as name,\n" +
            " h.start_day as start,\n" +
            " h.end_day as end,\n" +
            " h.deposit as deposit,\n" +
            "(d.rent_cost + IFNULL(ct.quantity * dv.price, 0)) AS total\n" +

            " from customer k\n" +
            " left join customer_type l on k.customer_type_type_customer_id = l.type_customer_id\n" +
            " left join contract h on k.customer_id = h.customer_customer_id\n" +
            " left join facility d on h.facility_facility_id =d.facility_id\n" +
            " left join contract_detail ct on h.contract_id = ct.contract_contract_id\n" +
            " left join attach_facility dv on ct.attach_facility_attach_id = dv.attach_id\n" +
            " group by h.contract_id,k.customer_id\n" +
            " order by k.customer_id",nativeQuery = true,countQuery = "select count(*) from \n" +
            "(\n" +
            "select\n" +
            " d.facility_name ,\n" +
            " k.name ,\n" +
            " l.customer_type_name,\t\n" +
            " h.start_day,\n" +
            " h.end_day,\n" +
            " h.deposit,\n" +
            " sum((ifnull(ct.quantity * dv.price,0)) + d.rent_cost)  as total\n" +
            " \n" +
            " from customer k\n" +
            " left join customer_type l on k.customer_type_type_customer_id = l.type_customer_id\n" +
            " left join contract h on k.customer_id = h.customer_customer_id\n" +
            " left join facility d on h.facility_facility_id =d.facility_id\n" +
            " left join contract_detail ct on h.contract_id = ct.contract_contract_id\n" +
            " left join attach_facility dv on ct.attach_facility_attach_id = dv.attach_id\n" +
            " group by h.contract_id ) countPage;")
    Page<ContractPage> money(Pageable pageable);

}
