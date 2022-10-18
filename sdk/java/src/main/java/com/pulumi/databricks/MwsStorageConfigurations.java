// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsStorageConfigurationsArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsStorageConfigurationsState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.inputs.BucketV2VersioningArgs;
 * import com.pulumi.databricks.MwsStorageConfigurations;
 * import com.pulumi.databricks.MwsStorageConfigurationsArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var databricksAccountId = config.get(&#34;databricksAccountId&#34;);
 *         var rootStorageBucket = new BucketV2(&#34;rootStorageBucket&#34;, BucketV2Args.builder()        
 *             .acl(&#34;private&#34;)
 *             .versionings(BucketV2VersioningArgs.builder()
 *                 .enabled(false)
 *                 .build())
 *             .build());
 * 
 *         var this_ = new MwsStorageConfigurations(&#34;this&#34;, MwsStorageConfigurationsArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .storageConfigurationName(String.format(&#34;%s-storage&#34;, var_.prefix()))
 *             .bucketName(rootStorageBucket.bucket())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * Provisioning Databricks on AWS guide.
 * * Provisioning Databricks on AWS with PrivateLink guide.
 * * databricks.MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
 * * databricks.MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
 * * databricks.MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
 * * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) &amp; subnets for new workspaces within AWS.
 * * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/mwsStorageConfigurations:MwsStorageConfigurations")
public class MwsStorageConfigurations extends com.pulumi.resources.CustomResource {
    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * name of AWS S3 bucket
     * 
     */
    @Export(name="bucketName", type=String.class, parameters={})
    private Output<String> bucketName;

    /**
     * @return name of AWS S3 bucket
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }
    @Export(name="creationTime", type=Integer.class, parameters={})
    private Output<Integer> creationTime;

    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    /**
     * (String) id of storage config to be used for `databricks_mws_workspace` resource.
     * 
     */
    @Export(name="storageConfigurationId", type=String.class, parameters={})
    private Output<String> storageConfigurationId;

    /**
     * @return (String) id of storage config to be used for `databricks_mws_workspace` resource.
     * 
     */
    public Output<String> storageConfigurationId() {
        return this.storageConfigurationId;
    }
    /**
     * name under which this storage configuration is stored
     * 
     */
    @Export(name="storageConfigurationName", type=String.class, parameters={})
    private Output<String> storageConfigurationName;

    /**
     * @return name under which this storage configuration is stored
     * 
     */
    public Output<String> storageConfigurationName() {
        return this.storageConfigurationName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsStorageConfigurations(String name) {
        this(name, MwsStorageConfigurationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsStorageConfigurations(String name, MwsStorageConfigurationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsStorageConfigurations(String name, MwsStorageConfigurationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsStorageConfigurations:MwsStorageConfigurations", name, args == null ? MwsStorageConfigurationsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MwsStorageConfigurations(String name, Output<String> id, @Nullable MwsStorageConfigurationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsStorageConfigurations:MwsStorageConfigurations", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "accountId"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MwsStorageConfigurations get(String name, Output<String> id, @Nullable MwsStorageConfigurationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsStorageConfigurations(name, id, state, options);
    }
}
