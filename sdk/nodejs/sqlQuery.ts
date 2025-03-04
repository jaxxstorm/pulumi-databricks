// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a `databricks_sql_query` resource with ID like the followingbash
 *
 * ```sh
 *  $ pulumi import databricks:index/sqlQuery:SqlQuery this <query-id>
 * ```
 */
export class SqlQuery extends pulumi.CustomResource {
    /**
     * Get an existing SqlQuery resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SqlQueryState, opts?: pulumi.CustomResourceOptions): SqlQuery {
        return new SqlQuery(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/sqlQuery:SqlQuery';

    /**
     * Returns true if the given object is an instance of SqlQuery.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SqlQuery {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SqlQuery.__pulumiType;
    }

    public readonly dataSourceId!: pulumi.Output<string>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly parameters!: pulumi.Output<outputs.SqlQueryParameter[] | undefined>;
    public readonly query!: pulumi.Output<string>;
    public readonly runAsRole!: pulumi.Output<string | undefined>;
    public readonly schedule!: pulumi.Output<outputs.SqlQuerySchedule | undefined>;
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a SqlQuery resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SqlQueryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SqlQueryArgs | SqlQueryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SqlQueryState | undefined;
            resourceInputs["dataSourceId"] = state ? state.dataSourceId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["query"] = state ? state.query : undefined;
            resourceInputs["runAsRole"] = state ? state.runAsRole : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as SqlQueryArgs | undefined;
            if ((!args || args.dataSourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataSourceId'");
            }
            if ((!args || args.query === undefined) && !opts.urn) {
                throw new Error("Missing required property 'query'");
            }
            resourceInputs["dataSourceId"] = args ? args.dataSourceId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["query"] = args ? args.query : undefined;
            resourceInputs["runAsRole"] = args ? args.runAsRole : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SqlQuery.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SqlQuery resources.
 */
export interface SqlQueryState {
    dataSourceId?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    parameters?: pulumi.Input<pulumi.Input<inputs.SqlQueryParameter>[]>;
    query?: pulumi.Input<string>;
    runAsRole?: pulumi.Input<string>;
    schedule?: pulumi.Input<inputs.SqlQuerySchedule>;
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a SqlQuery resource.
 */
export interface SqlQueryArgs {
    dataSourceId: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    parameters?: pulumi.Input<pulumi.Input<inputs.SqlQueryParameter>[]>;
    query: pulumi.Input<string>;
    runAsRole?: pulumi.Input<string>;
    schedule?: pulumi.Input<inputs.SqlQuerySchedule>;
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
