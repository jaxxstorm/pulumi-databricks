// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.EntitlementsArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.EntitlementsState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to set entitlements to existing databricks_users, databricks.Group or databricks.ServicePrincipal
 * 
 * ## Example Usage
 * 
 * Setting entitlements for a regular user:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetUserArgs;
 * import com.pulumi.databricks.Entitlements;
 * import com.pulumi.databricks.EntitlementsArgs;
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
 *         final var meUser = DatabricksFunctions.getUser(GetUserArgs.builder()
 *             .userName(&#34;me@example.com&#34;)
 *             .build());
 * 
 *         var meEntitlements = new Entitlements(&#34;meEntitlements&#34;, EntitlementsArgs.builder()        
 *             .userId(meUser.applyValue(getUserResult -&gt; getUserResult.id()))
 *             .allowClusterCreate(true)
 *             .allowInstancePoolCreate(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Setting entitlements for a service principal:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetServicePrincipalArgs;
 * import com.pulumi.databricks.Entitlements;
 * import com.pulumi.databricks.EntitlementsArgs;
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
 *         final var thisServicePrincipal = DatabricksFunctions.getServicePrincipal(GetServicePrincipalArgs.builder()
 *             .applicationId(&#34;11111111-2222-3333-4444-555666777888&#34;)
 *             .build());
 * 
 *         var thisEntitlements = new Entitlements(&#34;thisEntitlements&#34;, EntitlementsArgs.builder()        
 *             .servicePrincipalId(thisServicePrincipal.applyValue(getServicePrincipalResult -&gt; getServicePrincipalResult.spId()))
 *             .allowClusterCreate(true)
 *             .allowInstancePoolCreate(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Setting entitlements to all users in a workspace - referencing special `users` databricks.Group
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetGroupArgs;
 * import com.pulumi.databricks.Entitlements;
 * import com.pulumi.databricks.EntitlementsArgs;
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
 *         final var users = DatabricksFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName(&#34;users&#34;)
 *             .build());
 * 
 *         var workspace_users = new Entitlements(&#34;workspace-users&#34;, EntitlementsArgs.builder()        
 *             .groupId(users.applyValue(getGroupResult -&gt; getGroupResult.id()))
 *             .allowClusterCreate(true)
 *             .allowInstancePoolCreate(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * * databricks_group_member to attach users and groups as group members.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.User data to retrieve information about databricks_user.
 * 
 * ## Import
 * 
 * The resource can be imported using a synthetic identifier. Examples of valid synthetic identifiers are* `user/user_id` - user `user_id`. * `group/group_id` - group `group_id`. * `spn/spn_id` - service principal `spn_id`. bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/entitlements:Entitlements me user/&lt;user-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/entitlements:Entitlements")
public class Entitlements extends com.pulumi.resources.CustomResource {
    /**
     * Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
     * 
     */
    @Export(name="allowClusterCreate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowClusterCreate;

    /**
     * @return Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
     * 
     */
    public Output<Optional<Boolean>> allowClusterCreate() {
        return Codegen.optional(this.allowClusterCreate);
    }
    /**
     * Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    @Export(name="allowInstancePoolCreate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowInstancePoolCreate;

    /**
     * @return Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    public Output<Optional<Boolean>> allowInstancePoolCreate() {
        return Codegen.optional(this.allowInstancePoolCreate);
    }
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
     * 
     */
    @Export(name="databricksSqlAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> databricksSqlAccess;

    /**
     * @return This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
     * 
     */
    public Output<Optional<Boolean>> databricksSqlAccess() {
        return Codegen.optional(this.databricksSqlAccess);
    }
    /**
     * Canonical unique identifier for the group.
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupId;

    /**
     * @return Canonical unique identifier for the group.
     * 
     */
    public Output<Optional<String>> groupId() {
        return Codegen.optional(this.groupId);
    }
    /**
     * Canonical unique identifier for the service principal.
     * 
     */
    @Export(name="servicePrincipalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> servicePrincipalId;

    /**
     * @return Canonical unique identifier for the service principal.
     * 
     */
    public Output<Optional<String>> servicePrincipalId() {
        return Codegen.optional(this.servicePrincipalId);
    }
    /**
     * Canonical unique identifier for the user.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output</* @Nullable */ String> userId;

    /**
     * @return Canonical unique identifier for the user.
     * 
     */
    public Output<Optional<String>> userId() {
        return Codegen.optional(this.userId);
    }
    @Export(name="workspaceAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> workspaceAccess;

    public Output<Optional<Boolean>> workspaceAccess() {
        return Codegen.optional(this.workspaceAccess);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Entitlements(String name) {
        this(name, EntitlementsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Entitlements(String name, @Nullable EntitlementsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Entitlements(String name, @Nullable EntitlementsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/entitlements:Entitlements", name, args == null ? EntitlementsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Entitlements(String name, Output<String> id, @Nullable EntitlementsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/entitlements:Entitlements", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Entitlements get(String name, Output<String> id, @Nullable EntitlementsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Entitlements(name, id, state, options);
    }
}
