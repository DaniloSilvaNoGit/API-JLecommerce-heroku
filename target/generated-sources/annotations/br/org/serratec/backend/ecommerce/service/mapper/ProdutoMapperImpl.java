package br.org.serratec.backend.ecommerce.service.mapper;

import br.org.serratec.backend.ecommerce.model.Categoria;
import br.org.serratec.backend.ecommerce.model.Funcionario;
import br.org.serratec.backend.ecommerce.model.Produto;
import br.org.serratec.backend.ecommerce.model.dto.ProdutoDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-24T15:39:39-0300",
    comments = "version: 1.4.0.CR1, compiler: Eclipse JDT (IDE) 1.3.1300.v20210331-0708, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class ProdutoMapperImpl implements ProdutoMapper {

    @Override
    public ProdutoDTO toDTO(Produto produto) {
        if ( produto == null ) {
            return null;
        }

        ProdutoDTO produtoDTO = new ProdutoDTO();

        produtoDTO.setIdCategoria( produtoCategoriaId( produto ) );
        produtoDTO.setNomeCategoria( produtoCategoriaNome( produto ) );
        produtoDTO.setIdFuncionario( produtoFuncionarioId( produto ) );
        produtoDTO.setNomeFuncionario( produtoFuncionarioNome( produto ) );
        produtoDTO.setDataFabricacao( produto.getDataFabricacao() );
        produtoDTO.setDescricao( produto.getDescricao() );
        produtoDTO.setId( produto.getId() );
        produtoDTO.setNome( produto.getNome() );
        produtoDTO.setQtdEstoque( produto.getQtdEstoque() );
        produtoDTO.setValor( produto.getValor() );

        return produtoDTO;
    }

    @Override
    public Produto toEntity(ProdutoDTO produto) {
        if ( produto == null ) {
            return null;
        }

        Produto produto1 = new Produto();

        produto1.setCategoria( produtoDTOToCategoria( produto ) );
        produto1.setFuncionario( produtoDTOToFuncionario( produto ) );
        produto1.setDataFabricacao( produto.getDataFabricacao() );
        produto1.setDescricao( produto.getDescricao() );
        produto1.setId( produto.getId() );
        produto1.setNome( produto.getNome() );
        produto1.setQtdEstoque( produto.getQtdEstoque() );
        produto1.setValor( produto.getValor() );

        return produto1;
    }

    private Integer produtoCategoriaId(Produto produto) {
        if ( produto == null ) {
            return null;
        }
        Categoria categoria = produto.getCategoria();
        if ( categoria == null ) {
            return null;
        }
        Integer id = categoria.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String produtoCategoriaNome(Produto produto) {
        if ( produto == null ) {
            return null;
        }
        Categoria categoria = produto.getCategoria();
        if ( categoria == null ) {
            return null;
        }
        String nome = categoria.getNome();
        if ( nome == null ) {
            return null;
        }
        return nome;
    }

    private Integer produtoFuncionarioId(Produto produto) {
        if ( produto == null ) {
            return null;
        }
        Funcionario funcionario = produto.getFuncionario();
        if ( funcionario == null ) {
            return null;
        }
        Integer id = funcionario.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String produtoFuncionarioNome(Produto produto) {
        if ( produto == null ) {
            return null;
        }
        Funcionario funcionario = produto.getFuncionario();
        if ( funcionario == null ) {
            return null;
        }
        String nome = funcionario.getNome();
        if ( nome == null ) {
            return null;
        }
        return nome;
    }

    protected Categoria produtoDTOToCategoria(ProdutoDTO produtoDTO) {
        if ( produtoDTO == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setId( produtoDTO.getIdCategoria() );

        return categoria;
    }

    protected Funcionario produtoDTOToFuncionario(ProdutoDTO produtoDTO) {
        if ( produtoDTO == null ) {
            return null;
        }

        Funcionario funcionario = new Funcionario();

        funcionario.setId( produtoDTO.getIdFuncionario() );

        return funcionario;
    }
}
