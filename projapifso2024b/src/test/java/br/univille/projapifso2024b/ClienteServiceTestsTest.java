@SpringBootTest
@ContextConfiguration
@ActiveProfiles(profiles = "test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class ClienteServiceTests {
    @Autowired
    private ClienteService service;

    @Autowired
    private ClienteRepository repository;

    @Test
    public void createAndListCliente() {
        // Create a new client
        Cliente cliente = new Cliente();
        cliente.setNome("John Doe");
        cliente.setEmail("johndoe@example.com");

        // Save the client to the database
        service.save(cliente);

        // List all clients
        List<Cliente> listaClientes = service.getAll();

        // Assert that the list contains the created client
        assertTrue(listaClientes.contains(cliente));
    }
}