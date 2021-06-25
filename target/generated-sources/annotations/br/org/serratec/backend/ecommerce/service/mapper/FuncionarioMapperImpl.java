package br.org.serratec.backend.ecommerce.service.mapper;

import br.org.serratec.backend.ecommerce.model.Funcionario;
import br.org.serratec.backend.ecommerce.model.dto.FuncionarioDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-24T15:27:52-0300",
    comments = "version: 1.4.0.CR1, compiler: Eclipse JDT (IDE) 1.3.1300.v20210331-0708, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class FuncionarioMapperImpl implements FuncionarioMapper {

    @Override
    public FuncionarioDTO toDTO(Funcionario funcionario) {
        if ( funcionario == null ) {
            return null;
        }

        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();

        funcionarioDTO.setId( funcionario.getId() );
        funcionarioDTO.setNome( funcionario.getNome() );
        funcionarioDTO.setCpf( funcionario.getCpf() );

        return funcionarioDTO;
    }

    @Override
    public Funcionario toEntity(FuncionarioDTO funcionarioDTO) {
        if ( funcionarioDTO == null ) {
            return null;
        }

        Funcionario funcionario = new Funcionario();

        funcionario.setId( funcionarioDTO.getId() );
        funcionario.setNome( funcionarioDTO.getNome() );
        funcionario.setCpf( funcionarioDTO.getCpf() );

        return funcionario;
    }
}
