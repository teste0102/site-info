
@RestController
@RequestMapping("/produtos")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/listar")
    public List<Product> listarProdutos() {
        return productService.listarProdutos();
    }
}
