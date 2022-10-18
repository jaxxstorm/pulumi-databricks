// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * -> **Note** Importing this resource is not currently supported.
 */
export class MwsNetworks extends pulumi.CustomResource {
    /**
     * Get an existing MwsNetworks resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MwsNetworksState, opts?: pulumi.CustomResourceOptions): MwsNetworks {
        return new MwsNetworks(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mwsNetworks:MwsNetworks';

    /**
     * Returns true if the given object is an instance of MwsNetworks.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MwsNetworks {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MwsNetworks.__pulumiType;
    }

    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    public readonly accountId!: pulumi.Output<string>;
    public readonly creationTime!: pulumi.Output<number>;
    public readonly errorMessages!: pulumi.Output<outputs.MwsNetworksErrorMessage[]>;
    /**
     * (String) id of network to be used for databricksMwsWorkspace resource.
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * name under which this network is registered
     */
    public readonly networkName!: pulumi.Output<string>;
    public readonly securityGroupIds!: pulumi.Output<string[]>;
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * mapping of databricks.MwsVpcEndpoint for PrivateLink connections
     */
    public readonly vpcEndpoints!: pulumi.Output<outputs.MwsNetworksVpcEndpoints>;
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * (String) VPC attachment status
     */
    public readonly vpcStatus!: pulumi.Output<string>;
    /**
     * (Integer) id of associated workspace
     */
    public readonly workspaceId!: pulumi.Output<number>;

    /**
     * Create a MwsNetworks resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MwsNetworksArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MwsNetworksArgs | MwsNetworksState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MwsNetworksState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["creationTime"] = state ? state.creationTime : undefined;
            resourceInputs["errorMessages"] = state ? state.errorMessages : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["networkName"] = state ? state.networkName : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["vpcEndpoints"] = state ? state.vpcEndpoints : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vpcStatus"] = state ? state.vpcStatus : undefined;
            resourceInputs["workspaceId"] = state ? state.workspaceId : undefined;
        } else {
            const args = argsOrState as MwsNetworksArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.networkName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkName'");
            }
            if ((!args || args.securityGroupIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityGroupIds'");
            }
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["accountId"] = args?.accountId ? pulumi.secret(args.accountId) : undefined;
            resourceInputs["creationTime"] = args ? args.creationTime : undefined;
            resourceInputs["errorMessages"] = args ? args.errorMessages : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["networkName"] = args ? args.networkName : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["vpcEndpoints"] = args ? args.vpcEndpoints : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vpcStatus"] = args ? args.vpcStatus : undefined;
            resourceInputs["workspaceId"] = args ? args.workspaceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["accountId"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(MwsNetworks.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MwsNetworks resources.
 */
export interface MwsNetworksState {
    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    accountId?: pulumi.Input<string>;
    creationTime?: pulumi.Input<number>;
    errorMessages?: pulumi.Input<pulumi.Input<inputs.MwsNetworksErrorMessage>[]>;
    /**
     * (String) id of network to be used for databricksMwsWorkspace resource.
     */
    networkId?: pulumi.Input<string>;
    /**
     * name under which this network is registered
     */
    networkName?: pulumi.Input<string>;
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * mapping of databricks.MwsVpcEndpoint for PrivateLink connections
     */
    vpcEndpoints?: pulumi.Input<inputs.MwsNetworksVpcEndpoints>;
    vpcId?: pulumi.Input<string>;
    /**
     * (String) VPC attachment status
     */
    vpcStatus?: pulumi.Input<string>;
    /**
     * (Integer) id of associated workspace
     */
    workspaceId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MwsNetworks resource.
 */
export interface MwsNetworksArgs {
    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     */
    accountId: pulumi.Input<string>;
    creationTime?: pulumi.Input<number>;
    errorMessages?: pulumi.Input<pulumi.Input<inputs.MwsNetworksErrorMessage>[]>;
    /**
     * (String) id of network to be used for databricksMwsWorkspace resource.
     */
    networkId?: pulumi.Input<string>;
    /**
     * name under which this network is registered
     */
    networkName: pulumi.Input<string>;
    securityGroupIds: pulumi.Input<pulumi.Input<string>[]>;
    subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * mapping of databricks.MwsVpcEndpoint for PrivateLink connections
     */
    vpcEndpoints?: pulumi.Input<inputs.MwsNetworksVpcEndpoints>;
    vpcId: pulumi.Input<string>;
    /**
     * (String) VPC attachment status
     */
    vpcStatus?: pulumi.Input<string>;
    /**
     * (Integer) id of associated workspace
     */
    workspaceId?: pulumi.Input<number>;
}
