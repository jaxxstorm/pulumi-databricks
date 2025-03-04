// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.SqlVisualizationArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.SqlVisualizationState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * You can import a `databricks_sql_visualization` resource with ID like the followingbash
 * 
 * ```sh
 *  $ pulumi import databricks:index/sqlVisualization:SqlVisualization this &lt;query-id&gt;/&lt;visualization-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/sqlVisualization:SqlVisualization")
public class SqlVisualization extends com.pulumi.resources.CustomResource {
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="options", type=String.class, parameters={})
    private Output<String> options;

    public Output<String> options() {
        return this.options;
    }
    @Export(name="queryId", type=String.class, parameters={})
    private Output<String> queryId;

    public Output<String> queryId() {
        return this.queryId;
    }
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }
    @Export(name="visualizationId", type=String.class, parameters={})
    private Output<String> visualizationId;

    public Output<String> visualizationId() {
        return this.visualizationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlVisualization(String name) {
        this(name, SqlVisualizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlVisualization(String name, SqlVisualizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlVisualization(String name, SqlVisualizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlVisualization:SqlVisualization", name, args == null ? SqlVisualizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlVisualization(String name, Output<String> id, @Nullable SqlVisualizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlVisualization:SqlVisualization", name, state, makeResourceOptions(options, id));
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
    public static SqlVisualization get(String name, Output<String> id, @Nullable SqlVisualizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlVisualization(name, id, state, options);
    }
}
