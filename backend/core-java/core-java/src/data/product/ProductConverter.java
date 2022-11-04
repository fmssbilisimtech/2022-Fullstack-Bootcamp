package data.product;

public class ProductConverter {
    private final ProductInfo m_productInfo;

    public ProductConverter(ProductInfo productInfo)
    {
        m_productInfo = productInfo;
    }

    //...

    public ProductNameStockDTO toProductStockDTO()
    {
        return new ProductNameStockDTO(m_productInfo.getName(), m_productInfo.getStock());
    }
}
