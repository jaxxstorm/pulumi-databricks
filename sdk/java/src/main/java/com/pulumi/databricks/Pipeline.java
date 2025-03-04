// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.PipelineArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.PipelineState;
import com.pulumi.databricks.outputs.PipelineCluster;
import com.pulumi.databricks.outputs.PipelineFilters;
import com.pulumi.databricks.outputs.PipelineLibrary;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use `databricks.Pipeline` to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Notebook;
 * import com.pulumi.databricks.Pipeline;
 * import com.pulumi.databricks.PipelineArgs;
 * import com.pulumi.databricks.inputs.PipelineClusterArgs;
 * import com.pulumi.databricks.inputs.PipelineLibraryArgs;
 * import com.pulumi.databricks.inputs.PipelineLibraryNotebookArgs;
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
 *         var dltDemo = new Notebook(&#34;dltDemo&#34;);
 * 
 *         var this_ = new Pipeline(&#34;this&#34;, PipelineArgs.builder()        
 *             .storage(&#34;/test/first-pipeline&#34;)
 *             .configuration(Map.ofEntries(
 *                 Map.entry(&#34;key1&#34;, &#34;value1&#34;),
 *                 Map.entry(&#34;key2&#34;, &#34;value2&#34;)
 *             ))
 *             .clusters(            
 *                 PipelineClusterArgs.builder()
 *                     .label(&#34;default&#34;)
 *                     .numWorkers(2)
 *                     .customTags(Map.of(&#34;cluster_type&#34;, &#34;default&#34;))
 *                     .build(),
 *                 PipelineClusterArgs.builder()
 *                     .label(&#34;maintenance&#34;)
 *                     .numWorkers(1)
 *                     .customTags(Map.of(&#34;cluster_type&#34;, &#34;maintenance&#34;))
 *                     .build())
 *             .libraries(PipelineLibraryArgs.builder()
 *                 .notebook(PipelineLibraryNotebookArgs.builder()
 *                     .path(dltDemo.id())
 *                     .build())
 *                 .build())
 *             .continuous(false)
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
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 * * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
 * 
 * ## Import
 * 
 * The resource job can be imported using the id of the pipeline bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/pipeline:Pipeline this &lt;pipeline-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/pipeline:Pipeline")
public class Pipeline extends com.pulumi.resources.CustomResource {
    @Export(name="allowDuplicateNames", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowDuplicateNames;

    public Output<Optional<Boolean>> allowDuplicateNames() {
        return Codegen.optional(this.allowDuplicateNames);
    }
    /**
     * optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
     * 
     */
    @Export(name="channel", type=String.class, parameters={})
    private Output</* @Nullable */ String> channel;

    /**
     * @return optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
     * 
     */
    public Output<Optional<String>> channel() {
        return Codegen.optional(this.channel);
    }
    /**
     * blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
     * 
     */
    @Export(name="clusters", type=List.class, parameters={PipelineCluster.class})
    private Output</* @Nullable */ List<PipelineCluster>> clusters;

    /**
     * @return blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
     * 
     */
    public Output<Optional<List<PipelineCluster>>> clusters() {
        return Codegen.optional(this.clusters);
    }
    /**
     * An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
     * 
     */
    @Export(name="configuration", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> configuration;

    /**
     * @return An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
     * 
     */
    public Output<Optional<Map<String,Object>>> configuration() {
        return Codegen.optional(this.configuration);
    }
    /**
     * A flag indicating whether to run the pipeline continuously. The default value is `false`.
     * 
     */
    @Export(name="continuous", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> continuous;

    /**
     * @return A flag indicating whether to run the pipeline continuously. The default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> continuous() {
        return Codegen.optional(this.continuous);
    }
    /**
     * A flag indicating whether to run the pipeline in development mode. The default value is `false`.
     * 
     */
    @Export(name="development", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> development;

    /**
     * @return A flag indicating whether to run the pipeline in development mode. The default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> development() {
        return Codegen.optional(this.development);
    }
    /**
     * optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
     * 
     */
    @Export(name="edition", type=String.class, parameters={})
    private Output</* @Nullable */ String> edition;

    /**
     * @return optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
     * 
     */
    public Output<Optional<String>> edition() {
        return Codegen.optional(this.edition);
    }
    @Export(name="filters", type=PipelineFilters.class, parameters={})
    private Output</* @Nullable */ PipelineFilters> filters;

    public Output<Optional<PipelineFilters>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
     * 
     */
    @Export(name="libraries", type=List.class, parameters={PipelineLibrary.class})
    private Output</* @Nullable */ List<PipelineLibrary>> libraries;

    /**
     * @return blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
     * 
     */
    public Output<Optional<List<PipelineLibrary>>> libraries() {
        return Codegen.optional(this.libraries);
    }
    /**
     * A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A flag indicating whether to use Photon engine. The default value is `false`.
     * 
     */
    @Export(name="photon", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> photon;

    /**
     * @return A flag indicating whether to use Photon engine. The default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> photon() {
        return Codegen.optional(this.photon);
    }
    /**
     * A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
     * 
     */
    @Export(name="storage", type=String.class, parameters={})
    private Output</* @Nullable */ String> storage;

    /**
     * @return A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
     * 
     */
    public Output<Optional<String>> storage() {
        return Codegen.optional(this.storage);
    }
    /**
     * The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
     * 
     */
    @Export(name="target", type=String.class, parameters={})
    private Output</* @Nullable */ String> target;

    /**
     * @return The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
     * 
     */
    public Output<Optional<String>> target() {
        return Codegen.optional(this.target);
    }
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, @Nullable PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, @Nullable PipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/pipeline:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/pipeline:Pipeline", name, state, makeResourceOptions(options, id));
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
    public static Pipeline get(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, state, options);
    }
}
