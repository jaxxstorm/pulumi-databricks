// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * These resources are invoked in the account context. Provider must have `accountId` attribute configured.
 *
 * ## Example Usage
 *
 * In account context, adding account-level group to a workspace:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const dataEng = new databricks.Group("dataEng", {});
 * const addAdminGroup = new databricks.MwsPermissionAssignment("addAdminGroup", {
 *     workspaceId: databricks_mws_workspaces["this"].workspace_id,
 *     principalId: dataEng.id,
 *     permissions: ["ADMIN"],
 * });
 * ```
 *
 * In account context, adding account-level user to a workspace:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const me = new databricks.User("me", {userName: "me@example.com"});
 * const addUser = new databricks.MwsPermissionAssignment("addUser", {
 *     workspaceId: databricks_mws_workspaces["this"].workspace_id,
 *     principalId: me.id,
 *     permissions: ["USER"],
 * });
 * ```
 *
 * In account context, adding account-level service principal to a workspace:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sp = new databricks.ServicePrincipal("sp", {displayName: "Automation-only SP"});
 * const addAdminSpn = new databricks.MwsPermissionAssignment("addAdminSpn", {
 *     workspaceId: databricks_mws_workspaces["this"].workspace_id,
 *     principalId: sp.id,
 *     permissions: ["ADMIN"],
 * });
 * ```
 */
export class MwsPermissionAssignment extends pulumi.CustomResource {
    /**
     * Get an existing MwsPermissionAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MwsPermissionAssignmentState, opts?: pulumi.CustomResourceOptions): MwsPermissionAssignment {
        return new MwsPermissionAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mwsPermissionAssignment:MwsPermissionAssignment';

    /**
     * Returns true if the given object is an instance of MwsPermissionAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MwsPermissionAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MwsPermissionAssignment.__pulumiType;
    }

    public readonly permissions!: pulumi.Output<string[]>;
    public readonly principalId!: pulumi.Output<number>;
    public readonly workspaceId!: pulumi.Output<number>;

    /**
     * Create a MwsPermissionAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MwsPermissionAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MwsPermissionAssignmentArgs | MwsPermissionAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MwsPermissionAssignmentState | undefined;
            resourceInputs["permissions"] = state ? state.permissions : undefined;
            resourceInputs["principalId"] = state ? state.principalId : undefined;
            resourceInputs["workspaceId"] = state ? state.workspaceId : undefined;
        } else {
            const args = argsOrState as MwsPermissionAssignmentArgs | undefined;
            if ((!args || args.permissions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'permissions'");
            }
            if ((!args || args.principalId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'principalId'");
            }
            if ((!args || args.workspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workspaceId'");
            }
            resourceInputs["permissions"] = args ? args.permissions : undefined;
            resourceInputs["principalId"] = args ? args.principalId : undefined;
            resourceInputs["workspaceId"] = args ? args.workspaceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MwsPermissionAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MwsPermissionAssignment resources.
 */
export interface MwsPermissionAssignmentState {
    permissions?: pulumi.Input<pulumi.Input<string>[]>;
    principalId?: pulumi.Input<number>;
    workspaceId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MwsPermissionAssignment resource.
 */
export interface MwsPermissionAssignmentArgs {
    permissions: pulumi.Input<pulumi.Input<string>[]>;
    principalId: pulumi.Input<number>;
    workspaceId: pulumi.Input<number>;
}
