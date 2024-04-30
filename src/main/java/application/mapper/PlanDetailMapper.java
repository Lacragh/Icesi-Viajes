package application.mapper;

import application.domain.PlanDetail;
import application.dto.PlanDetailDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface PlanDetailMapper {

    @Mapping(source = "destinationType", target = "destinationType")
    PlanDetailDTO toPlanDetailDTO(PlanDetail entity);

    @Mapping(source = "destinationType", target = "destinationType")
    PlanDetail toPlanDetail(PlanDetailDTO entity);

    @Mapping(source = "destinationType", target = "destinationType")
    List<PlanDetailDTO> toPlanDetailDTO(List<PlanDetail> entity);

    @Mapping(source = "destinationType", target = "destinationType")
    List<PlanDetail> toPlanDetail(List<PlanDetailDTO> entity);

}
