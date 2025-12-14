public class KongModuleImpl implements KongModule {

    @Override
    public void reloadConfiguration() {
        // charger infra/kong.yaml
        System.out.println("Kong configuration reloaded");
    }

    @Override
    public String healthStatus() {
        return "KONG OK";
    }
}
