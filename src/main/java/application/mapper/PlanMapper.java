package application.mapper;

import application.domain.Plan;
import application.dto.PlanDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface PlanMapper {

    @Mapping(source = "client", target = "client")
    PlanDTO toPlanDTO(Plan entity);

    @Mapping(source = "client", target = "client")
    Plan toPlan(PlanDTO entity);

    @Mapping(source = "client", target = "client")
    List<PlanDTO> toPlanDTO(List<Plan> entity);

    @Mapping(source = "client", target = "client")
    List<Plan> toPlan(List<PlanDTO> entity);

}
