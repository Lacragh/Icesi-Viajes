package application.mapper;

import application.domain.Sale;
import application.dto.SaleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface SaleMapper {

    @Mapping(source = "destinationType", target = "destinationType")
    SaleDTO toSaleDTO(Sale entity);

    @Mapping(source = "destinationType", target = "destinationType")
    Sale toSale(SaleDTO entity);

    @Mapping(source = "destinationType", target = "destinationType")
    List<SaleDTO> toSaleDTO(List<Sale> entity);

    @Mapping(source = "destinationType", target = "destinationType")
    List<Sale> toSale(List<SaleDTO> entity);

}
