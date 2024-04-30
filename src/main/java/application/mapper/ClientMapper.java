package application.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import application.domain.Client;
import application.dto.ClientDTO;

import java.util.List;

@Mapper
public interface ClientMapper {

	ClientDTO toClientDTO(Client entity);

	Client toClient(ClientDTO entity);

	List<ClientDTO> toClientDTO(List<Client> entity);

	List<Client> toClient(List<ClientDTO> entity);

}
