// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource creates [Personal Access Tokens](https://docs.databricks.com/sql/user/security/personal-access-tokens.html) for the same user that is authenticated with the provider. Most likely you should use databricks.OboToken to create [On-Behalf-Of tokens](https://docs.databricks.com/administration-guide/users-groups/service-principals.html#manage-personal-access-tokens-for-a-service-principal) for a databricks.ServicePrincipal in Databricks workspaces on AWS. Databricks workspaces on other clouds use their own native OAuth token flows.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * // initialize provider in normal mode
 * const createdWorkspace = new databricks.Provider("createdWorkspace", {host: databricks_mws_workspaces["this"].workspace_url});
 * // create PAT token to provision entities within workspace
 * const pat = new databricks.Token("pat", {
 *     comment: "Terraform Provisioning",
 *     lifetimeSeconds: 8640000,
 * }, {
 *     provider: databricks.created_workspace,
 * });
 * export const databricksToken = pat.tokenValue;
 * ```
 *
 * ## Import
 *
 * -> **Note** Importing this resource is not currently supported.
 */
export class Token extends pulumi.CustomResource {
    /**
     * Get an existing Token resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TokenState, opts?: pulumi.CustomResourceOptions): Token {
        return new Token(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/token:Token';

    /**
     * Returns true if the given object is an instance of Token.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Token {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Token.__pulumiType;
    }

    /**
     * (String) Comment that will appear on the user’s settings page for this token.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    public readonly creationTime!: pulumi.Output<number>;
    public readonly expiryTime!: pulumi.Output<number>;
    /**
     * (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
     */
    public readonly lifetimeSeconds!: pulumi.Output<number | undefined>;
    public readonly tokenId!: pulumi.Output<string>;
    /**
     * **Sensitive** value of the newly-created token.
     */
    public /*out*/ readonly tokenValue!: pulumi.Output<string>;

    /**
     * Create a Token resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TokenArgs | TokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TokenState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["creationTime"] = state ? state.creationTime : undefined;
            resourceInputs["expiryTime"] = state ? state.expiryTime : undefined;
            resourceInputs["lifetimeSeconds"] = state ? state.lifetimeSeconds : undefined;
            resourceInputs["tokenId"] = state ? state.tokenId : undefined;
            resourceInputs["tokenValue"] = state ? state.tokenValue : undefined;
        } else {
            const args = argsOrState as TokenArgs | undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["creationTime"] = args ? args.creationTime : undefined;
            resourceInputs["expiryTime"] = args ? args.expiryTime : undefined;
            resourceInputs["lifetimeSeconds"] = args ? args.lifetimeSeconds : undefined;
            resourceInputs["tokenId"] = args ? args.tokenId : undefined;
            resourceInputs["tokenValue"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["tokenValue"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Token.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Token resources.
 */
export interface TokenState {
    /**
     * (String) Comment that will appear on the user’s settings page for this token.
     */
    comment?: pulumi.Input<string>;
    creationTime?: pulumi.Input<number>;
    expiryTime?: pulumi.Input<number>;
    /**
     * (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
     */
    lifetimeSeconds?: pulumi.Input<number>;
    tokenId?: pulumi.Input<string>;
    /**
     * **Sensitive** value of the newly-created token.
     */
    tokenValue?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Token resource.
 */
export interface TokenArgs {
    /**
     * (String) Comment that will appear on the user’s settings page for this token.
     */
    comment?: pulumi.Input<string>;
    creationTime?: pulumi.Input<number>;
    expiryTime?: pulumi.Input<number>;
    /**
     * (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
     */
    lifetimeSeconds?: pulumi.Input<number>;
    tokenId?: pulumi.Input<string>;
}
