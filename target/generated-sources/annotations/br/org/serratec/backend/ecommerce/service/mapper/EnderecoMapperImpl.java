package br.org.serratec.backend.ecommerce.service.mapper;

import br.org.serratec.backend.ecommerce.model.Endereco;
import br.org.serratec.backend.ecommerce.model.dto.EnderecoDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-24T15:27:51-0300",
    comments = "version: 1.4.0.CR1, compiler: Eclipse JDT (IDE) 1.3.1300.v20210331-0708, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class EnderecoMapperImpl implements EnderecoMapper {

    @Override
    public EnderecoDTO toDTO(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        EnderecoDTO enderecoDTO = new EnderecoDTO();

        enderecoDTO.setRua( endereco.getRua() );
        enderecoDTO.setNumero( endereco.getNumero() );
        enderecoDTO.setComplemento( endereco.getComplemento() );
        enderecoDTO.setBairro( endereco.getBairro() );
        enderecoDTO.setCidade( endereco.getCidade() );
        enderecoDTO.setEstado( endereco.getEstado() );
        enderecoDTO.setCep( endereco.getCep() );

        return enderecoDTO;
    }

    @Override
    public Endereco toEntity(EnderecoDTO enderecoDTO) {
        if ( enderecoDTO == null ) {
            return null;
        }

        Endereco endereco = new Endereco();

        endereco.setRua( enderecoDTO.getRua() );
        endereco.setNumero( enderecoDTO.getNumero() );
        endereco.setComplemento( enderecoDTO.getComplemento() );
        endereco.setBairro( enderecoDTO.getBairro() );
        endereco.setCidade( enderecoDTO.getCidade() );
        endereco.setEstado( enderecoDTO.getEstado() );
        endereco.setCep( enderecoDTO.getCep() );

        return endereco;
    }
}
