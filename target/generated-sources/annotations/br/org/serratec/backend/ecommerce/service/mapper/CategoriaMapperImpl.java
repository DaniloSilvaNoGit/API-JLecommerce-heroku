package br.org.serratec.backend.ecommerce.service.mapper;

import br.org.serratec.backend.ecommerce.model.Categoria;
import br.org.serratec.backend.ecommerce.model.dto.CategoriaDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-24T15:27:51-0300",
    comments = "version: 1.4.0.CR1, compiler: Eclipse JDT (IDE) 1.3.1300.v20210331-0708, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class CategoriaMapperImpl implements CategoriaMapper {

    @Override
    public CategoriaDTO toDTO(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaDTO categoriaDTO = new CategoriaDTO();

        categoriaDTO.setId( categoria.getId() );
        categoriaDTO.setNome( categoria.getNome() );
        categoriaDTO.setDescricao( categoria.getDescricao() );

        return categoriaDTO;
    }

    @Override
    public Categoria toEntity(CategoriaDTO categoriaDTO) {
        if ( categoriaDTO == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setId( categoriaDTO.getId() );
        categoria.setNome( categoriaDTO.getNome() );
        categoria.setDescricao( categoriaDTO.getDescricao() );

        return categoria;
    }
}
