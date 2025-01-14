// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricksGroupMember to attach users and groups as group members.
 * * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.
 *
 * ## Import
 *
 * The resource scim service principal can be imported using idbash
 *
 * ```sh
 *  $ pulumi import databricks:index/servicePrincipal:ServicePrincipal me <service-principal-id>
 * ```
 */
export class ServicePrincipal extends pulumi.CustomResource {
    /**
     * Get an existing ServicePrincipal resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServicePrincipalState, opts?: pulumi.CustomResourceOptions): ServicePrincipal {
        return new ServicePrincipal(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/servicePrincipal:ServicePrincipal';

    /**
     * Returns true if the given object is an instance of ServicePrincipal.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServicePrincipal {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServicePrincipal.__pulumiType;
    }

    /**
     * Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     */
    public readonly active!: pulumi.Output<boolean | undefined>;
    /**
     * Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     */
    public readonly allowClusterCreate!: pulumi.Output<boolean | undefined>;
    /**
     * Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instancePoolId argument.
     */
    public readonly allowInstancePoolCreate!: pulumi.Output<boolean | undefined>;
    /**
     * This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     */
    public readonly databricksSqlAccess!: pulumi.Output<boolean | undefined>;
    /**
     * This is an alias for the service principal and can be the full name of the service principal.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * ID of the service principal in an external identity provider.
     */
    public readonly externalId!: pulumi.Output<string | undefined>;
    public readonly force!: pulumi.Output<boolean | undefined>;
    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     */
    public readonly workspaceAccess!: pulumi.Output<boolean | undefined>;

    /**
     * Create a ServicePrincipal resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ServicePrincipalArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServicePrincipalArgs | ServicePrincipalState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServicePrincipalState | undefined;
            resourceInputs["active"] = state ? state.active : undefined;
            resourceInputs["allowClusterCreate"] = state ? state.allowClusterCreate : undefined;
            resourceInputs["allowInstancePoolCreate"] = state ? state.allowInstancePoolCreate : undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["databricksSqlAccess"] = state ? state.databricksSqlAccess : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["externalId"] = state ? state.externalId : undefined;
            resourceInputs["force"] = state ? state.force : undefined;
            resourceInputs["workspaceAccess"] = state ? state.workspaceAccess : undefined;
        } else {
            const args = argsOrState as ServicePrincipalArgs | undefined;
            resourceInputs["active"] = args ? args.active : undefined;
            resourceInputs["allowClusterCreate"] = args ? args.allowClusterCreate : undefined;
            resourceInputs["allowInstancePoolCreate"] = args ? args.allowInstancePoolCreate : undefined;
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["databricksSqlAccess"] = args ? args.databricksSqlAccess : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["externalId"] = args ? args.externalId : undefined;
            resourceInputs["force"] = args ? args.force : undefined;
            resourceInputs["workspaceAccess"] = args ? args.workspaceAccess : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServicePrincipal.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServicePrincipal resources.
 */
export interface ServicePrincipalState {
    /**
     * Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     */
    active?: pulumi.Input<boolean>;
    /**
     * Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     */
    allowClusterCreate?: pulumi.Input<boolean>;
    /**
     * Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instancePoolId argument.
     */
    allowInstancePoolCreate?: pulumi.Input<boolean>;
    /**
     * This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     */
    databricksSqlAccess?: pulumi.Input<boolean>;
    /**
     * This is an alias for the service principal and can be the full name of the service principal.
     */
    displayName?: pulumi.Input<string>;
    /**
     * ID of the service principal in an external identity provider.
     */
    externalId?: pulumi.Input<string>;
    force?: pulumi.Input<boolean>;
    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     */
    workspaceAccess?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ServicePrincipal resource.
 */
export interface ServicePrincipalArgs {
    /**
     * Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     */
    active?: pulumi.Input<boolean>;
    /**
     * Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     */
    allowClusterCreate?: pulumi.Input<boolean>;
    /**
     * Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instancePoolId argument.
     */
    allowInstancePoolCreate?: pulumi.Input<boolean>;
    /**
     * This is the application id of the given service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     */
    databricksSqlAccess?: pulumi.Input<boolean>;
    /**
     * This is an alias for the service principal and can be the full name of the service principal.
     */
    displayName?: pulumi.Input<string>;
    /**
     * ID of the service principal in an external identity provider.
     */
    externalId?: pulumi.Input<string>;
    force?: pulumi.Input<boolean>;
    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     */
    workspaceAccess?: pulumi.Input<boolean>;
}
