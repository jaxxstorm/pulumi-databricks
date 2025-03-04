// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Within a metastore, Unity Catalog provides the ability to create a recipient to attach delta shares to.
 *
 * A `databricks.Recipient` is contained within databricks.Metastore and can contain a list of shares.
 *
 * ## Example Usage
 * ### Databricks Sharing with non databricks recipient
 *
 * Setting `authenticationType` type to `TOKEN` creates a temporary url to download a credentials file. This is used to
 * authenticate to the sharing server to access data. This is for when the recipient is not using Databricks.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 * import * as random from "@pulumi/random";
 *
 * const db2opensharecode = new random.RandomPassword("db2opensharecode", {
 *     length: 16,
 *     special: true,
 * });
 * const current = databricks.getCurrentUser({});
 * const db2open = new databricks.Recipient("db2open", {
 *     comment: "made by terraform",
 *     authenticationType: "TOKEN",
 *     sharingCode: db2opensharecode.result,
 *     ipAccessList: {
 *         allowedIpAddresses: [],
 *     },
 * });
 * ```
 * ## Attribute Reference:
 *
 * * `tokens` - (Optional) List of Recipient Tokens.
 */
export class Recipient extends pulumi.CustomResource {
    /**
     * Get an existing Recipient resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RecipientState, opts?: pulumi.CustomResourceOptions): Recipient {
        return new Recipient(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/recipient:Recipient';

    /**
     * Returns true if the given object is an instance of Recipient.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Recipient {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Recipient.__pulumiType;
    }

    /**
     * The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
     */
    public readonly authenticationType!: pulumi.Output<string>;
    /**
     * Description about the recipient.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Required when authenticationType is DATABRICKS.
     */
    public readonly dataRecipientGlobalMetastoreId!: pulumi.Output<string | undefined>;
    /**
     * The one-time sharing code provided by the data recipient.
     */
    public readonly ipAccessList!: pulumi.Output<outputs.RecipientIpAccessList | undefined>;
    /**
     * Name of recipient. Change forces creation of a new resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The one-time sharing code provided by the data recipient.
     */
    public readonly sharingCode!: pulumi.Output<string | undefined>;
    public readonly tokens!: pulumi.Output<outputs.RecipientToken[]>;

    /**
     * Create a Recipient resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RecipientArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RecipientArgs | RecipientState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RecipientState | undefined;
            resourceInputs["authenticationType"] = state ? state.authenticationType : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["dataRecipientGlobalMetastoreId"] = state ? state.dataRecipientGlobalMetastoreId : undefined;
            resourceInputs["ipAccessList"] = state ? state.ipAccessList : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["sharingCode"] = state ? state.sharingCode : undefined;
            resourceInputs["tokens"] = state ? state.tokens : undefined;
        } else {
            const args = argsOrState as RecipientArgs | undefined;
            if ((!args || args.authenticationType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authenticationType'");
            }
            resourceInputs["authenticationType"] = args ? args.authenticationType : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["dataRecipientGlobalMetastoreId"] = args ? args.dataRecipientGlobalMetastoreId : undefined;
            resourceInputs["ipAccessList"] = args ? args.ipAccessList : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["sharingCode"] = args ? args.sharingCode : undefined;
            resourceInputs["tokens"] = args ? args.tokens : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Recipient.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Recipient resources.
 */
export interface RecipientState {
    /**
     * The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
     */
    authenticationType?: pulumi.Input<string>;
    /**
     * Description about the recipient.
     */
    comment?: pulumi.Input<string>;
    /**
     * Required when authenticationType is DATABRICKS.
     */
    dataRecipientGlobalMetastoreId?: pulumi.Input<string>;
    /**
     * The one-time sharing code provided by the data recipient.
     */
    ipAccessList?: pulumi.Input<inputs.RecipientIpAccessList>;
    /**
     * Name of recipient. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The one-time sharing code provided by the data recipient.
     */
    sharingCode?: pulumi.Input<string>;
    tokens?: pulumi.Input<pulumi.Input<inputs.RecipientToken>[]>;
}

/**
 * The set of arguments for constructing a Recipient resource.
 */
export interface RecipientArgs {
    /**
     * The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
     */
    authenticationType: pulumi.Input<string>;
    /**
     * Description about the recipient.
     */
    comment?: pulumi.Input<string>;
    /**
     * Required when authenticationType is DATABRICKS.
     */
    dataRecipientGlobalMetastoreId?: pulumi.Input<string>;
    /**
     * The one-time sharing code provided by the data recipient.
     */
    ipAccessList?: pulumi.Input<inputs.RecipientIpAccessList>;
    /**
     * Name of recipient. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The one-time sharing code provided by the data recipient.
     */
    sharingCode?: pulumi.Input<string>;
    tokens?: pulumi.Input<pulumi.Input<inputs.RecipientToken>[]>;
}
