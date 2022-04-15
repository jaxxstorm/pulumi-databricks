// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Listing all tables in a _things_ databricks.Schema from _sandbox_ databricks_catalog:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const things = databricks.getTables({
 *     catalogName: "sandbox",
 *     schemaName: "things",
 * });
 * export const allThingsTables = things;
 * ```
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Table to manage tables within Unity Catalog.
 * * databricks.Schema to manage schemas within Unity Catalog.
 * * databricks.Catalog to manage catalogs within Unity Catalog.
 */
export function getTables(args: GetTablesArgs, opts?: pulumi.InvokeOptions): Promise<GetTablesResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("databricks:index/getTables:getTables", {
        "catalogName": args.catalogName,
        "ids": args.ids,
        "schemaName": args.schemaName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTables.
 */
export interface GetTablesArgs {
    /**
     * Name of databricks_catalog
     */
    catalogName: string;
    /**
     * set of databricks.Table full names: *`catalog`.`schema`.`table`*
     */
    ids?: string[];
    /**
     * Name of databricks_schema
     */
    schemaName: string;
}

/**
 * A collection of values returned by getTables.
 */
export interface GetTablesResult {
    readonly catalogName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * set of databricks.Table full names: *`catalog`.`schema`.`table`*
     */
    readonly ids: string[];
    readonly schemaName: string;
}

export function getTablesOutput(args: GetTablesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTablesResult> {
    return pulumi.output(args).apply(a => getTables(a, opts))
}

/**
 * A collection of arguments for invoking getTables.
 */
export interface GetTablesOutputArgs {
    /**
     * Name of databricks_catalog
     */
    catalogName: pulumi.Input<string>;
    /**
     * set of databricks.Table full names: *`catalog`.`schema`.`table`*
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of databricks_schema
     */
    schemaName: pulumi.Input<string>;
}