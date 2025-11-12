
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listarProdutos() {
        return productRepository.findAll();
    }
}
