package br.org.serratec.backend.ecommerce.service.mapper;

import br.org.serratec.backend.ecommerce.model.PedidoItem;
import br.org.serratec.backend.ecommerce.model.Produto;
import br.org.serratec.backend.ecommerce.model.dto.PedidoItemDTO;
import br.org.serratec.backend.ecommerce.model.pk.PedidoItemPk;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-24T15:27:52-0300",
    comments = "version: 1.4.0.CR1, compiler: Eclipse JDT (IDE) 1.3.1300.v20210331-0708, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class PedidoItemMapperImpl implements PedidoItemMapper {

    @Override
    public PedidoItemDTO toDTO(PedidoItem pedidoItem) {
        if ( pedidoItem == null ) {
            return null;
        }

        PedidoItemDTO pedidoItemDTO = new PedidoItemDTO();

        pedidoItemDTO.setIdProduto( pedidoItemIdProdutoId( pedidoItem ) );
        pedidoItemDTO.setNomeProduto( pedidoItemIdProdutoNome( pedidoItem ) );
        pedidoItemDTO.setQtdItens( pedidoItem.getQtdItens() );
        pedidoItemDTO.setValor( pedidoItem.getValor() );
        pedidoItemDTO.setSubTotal( pedidoItem.getSubTotal() );

        return pedidoItemDTO;
    }

    @Override
    public PedidoItem toEntity(PedidoItemDTO pedidoItemDTO) {
        if ( pedidoItemDTO == null ) {
            return null;
        }

        PedidoItem pedidoItem = new PedidoItem();

        pedidoItem.setId( pedidoItemDTOToPedidoItemPk( pedidoItemDTO ) );
        pedidoItem.setQtdItens( pedidoItemDTO.getQtdItens() );
        pedidoItem.setValor( pedidoItemDTO.getValor() );

        return pedidoItem;
    }

    private Integer pedidoItemIdProdutoId(PedidoItem pedidoItem) {
        if ( pedidoItem == null ) {
            return null;
        }
        PedidoItemPk id = pedidoItem.getId();
        if ( id == null ) {
            return null;
        }
        Produto produto = id.getProduto();
        if ( produto == null ) {
            return null;
        }
        Integer id1 = produto.getId();
        if ( id1 == null ) {
            return null;
        }
        return id1;
    }

    private String pedidoItemIdProdutoNome(PedidoItem pedidoItem) {
        if ( pedidoItem == null ) {
            return null;
        }
        PedidoItemPk id = pedidoItem.getId();
        if ( id == null ) {
            return null;
        }
        Produto produto = id.getProduto();
        if ( produto == null ) {
            return null;
        }
        String nome = produto.getNome();
        if ( nome == null ) {
            return null;
        }
        return nome;
    }

    protected Produto pedidoItemDTOToProduto(PedidoItemDTO pedidoItemDTO) {
        if ( pedidoItemDTO == null ) {
            return null;
        }

        Produto produto = new Produto();

        produto.setId( pedidoItemDTO.getIdProduto() );

        return produto;
    }

    protected PedidoItemPk pedidoItemDTOToPedidoItemPk(PedidoItemDTO pedidoItemDTO) {
        if ( pedidoItemDTO == null ) {
            return null;
        }

        PedidoItemPk pedidoItemPk = new PedidoItemPk();

        pedidoItemPk.setProduto( pedidoItemDTOToProduto( pedidoItemDTO ) );

        return pedidoItemPk;
    }
}
