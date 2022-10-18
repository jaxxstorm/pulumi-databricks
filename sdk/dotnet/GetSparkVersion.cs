// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetSparkVersion
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var withGpu = Databricks.GetNodeType.Invoke(new()
        ///     {
        ///         LocalDisk = true,
        ///         MinCores = 16,
        ///         GbPerCore = 1,
        ///         MinGpus = 1,
        ///     });
        /// 
        ///     var gpuMl = Databricks.GetSparkVersion.Invoke(new()
        ///     {
        ///         Gpu = true,
        ///         Ml = true,
        ///     });
        /// 
        ///     var research = new Databricks.Cluster("research", new()
        ///     {
        ///         ClusterName = "Research Cluster",
        ///         SparkVersion = gpuMl.Apply(getSparkVersionResult =&gt; getSparkVersionResult.Id),
        ///         NodeTypeId = withGpu.Apply(getNodeTypeResult =&gt; getNodeTypeResult.Id),
        ///         AutoterminationMinutes = 20,
        ///         Autoscale = new Databricks.Inputs.ClusterAutoscaleArgs
        ///         {
        ///             MinWorkers = 1,
        ///             MaxWorkers = 50,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
        /// * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
        /// * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
        /// * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
        /// </summary>
        public static Task<GetSparkVersionResult> InvokeAsync(GetSparkVersionArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSparkVersionResult>("databricks:index/getSparkVersion:getSparkVersion", args ?? new GetSparkVersionArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var withGpu = Databricks.GetNodeType.Invoke(new()
        ///     {
        ///         LocalDisk = true,
        ///         MinCores = 16,
        ///         GbPerCore = 1,
        ///         MinGpus = 1,
        ///     });
        /// 
        ///     var gpuMl = Databricks.GetSparkVersion.Invoke(new()
        ///     {
        ///         Gpu = true,
        ///         Ml = true,
        ///     });
        /// 
        ///     var research = new Databricks.Cluster("research", new()
        ///     {
        ///         ClusterName = "Research Cluster",
        ///         SparkVersion = gpuMl.Apply(getSparkVersionResult =&gt; getSparkVersionResult.Id),
        ///         NodeTypeId = withGpu.Apply(getNodeTypeResult =&gt; getNodeTypeResult.Id),
        ///         AutoterminationMinutes = 20,
        ///         Autoscale = new Databricks.Inputs.ClusterAutoscaleArgs
        ///         {
        ///             MinWorkers = 1,
        ///             MaxWorkers = 50,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
        /// * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
        /// * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
        /// * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
        /// </summary>
        public static Output<GetSparkVersionResult> Invoke(GetSparkVersionInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSparkVersionResult>("databricks:index/getSparkVersion:getSparkVersion", args ?? new GetSparkVersionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSparkVersionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// if we should limit the search only to runtimes that are in Beta stage. Default to `false`.
        /// </summary>
        [Input("beta")]
        public bool? Beta { get; set; }

        /// <summary>
        /// if we should limit the search only to Genomics (HLS) runtimes. Default to `false`.
        /// </summary>
        [Input("genomics")]
        public bool? Genomics { get; set; }

        /// <summary>
        /// if we should limit the search only to runtimes that support GPUs. Default to `false`.
        /// </summary>
        [Input("gpu")]
        public bool? Gpu { get; set; }

        /// <summary>
        /// if we should limit the search only to runtimes supporting AWS Graviton CPUs. Default to `false`.
        /// </summary>
        [Input("graviton")]
        public bool? Graviton { get; set; }

        /// <summary>
        /// if we should return only the latest version if there is more than one result.  Default to `true`. If set to `false` and multiple versions are matching, throws an error.
        /// </summary>
        [Input("latest")]
        public bool? Latest { get; set; }

        /// <summary>
        /// if we should limit the search only to LTS (long term support) &amp; ESR (extended support) versions. Default to `false`.
        /// </summary>
        [Input("longTermSupport")]
        public bool? LongTermSupport { get; set; }

        /// <summary>
        /// if we should limit the search only to ML runtimes. Default to `false`.
        /// </summary>
        [Input("ml")]
        public bool? Ml { get; set; }

        /// <summary>
        /// if we should limit the search only to Photon runtimes. Default to `false`.
        /// </summary>
        [Input("photon")]
        public bool? Photon { get; set; }

        /// <summary>
        /// if we should limit the search only to runtimes that are based on specific Scala version. Default to `2.12`.
        /// </summary>
        [Input("scala")]
        public string? Scala { get; set; }

        /// <summary>
        /// if we should limit the search only to runtimes that are based on specific Spark version. Default to empty string.  It could be specified as `3`, or `3.0`, or full version, like, `3.0.1`.
        /// </summary>
        [Input("sparkVersion")]
        public string? SparkVersion { get; set; }

        public GetSparkVersionArgs()
        {
        }
        public static new GetSparkVersionArgs Empty => new GetSparkVersionArgs();
    }

    public sealed class GetSparkVersionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// if we should limit the search only to runtimes that are in Beta stage. Default to `false`.
        /// </summary>
        [Input("beta")]
        public Input<bool>? Beta { get; set; }

        /// <summary>
        /// if we should limit the search only to Genomics (HLS) runtimes. Default to `false`.
        /// </summary>
        [Input("genomics")]
        public Input<bool>? Genomics { get; set; }

        /// <summary>
        /// if we should limit the search only to runtimes that support GPUs. Default to `false`.
        /// </summary>
        [Input("gpu")]
        public Input<bool>? Gpu { get; set; }

        /// <summary>
        /// if we should limit the search only to runtimes supporting AWS Graviton CPUs. Default to `false`.
        /// </summary>
        [Input("graviton")]
        public Input<bool>? Graviton { get; set; }

        /// <summary>
        /// if we should return only the latest version if there is more than one result.  Default to `true`. If set to `false` and multiple versions are matching, throws an error.
        /// </summary>
        [Input("latest")]
        public Input<bool>? Latest { get; set; }

        /// <summary>
        /// if we should limit the search only to LTS (long term support) &amp; ESR (extended support) versions. Default to `false`.
        /// </summary>
        [Input("longTermSupport")]
        public Input<bool>? LongTermSupport { get; set; }

        /// <summary>
        /// if we should limit the search only to ML runtimes. Default to `false`.
        /// </summary>
        [Input("ml")]
        public Input<bool>? Ml { get; set; }

        /// <summary>
        /// if we should limit the search only to Photon runtimes. Default to `false`.
        /// </summary>
        [Input("photon")]
        public Input<bool>? Photon { get; set; }

        /// <summary>
        /// if we should limit the search only to runtimes that are based on specific Scala version. Default to `2.12`.
        /// </summary>
        [Input("scala")]
        public Input<string>? Scala { get; set; }

        /// <summary>
        /// if we should limit the search only to runtimes that are based on specific Spark version. Default to empty string.  It could be specified as `3`, or `3.0`, or full version, like, `3.0.1`.
        /// </summary>
        [Input("sparkVersion")]
        public Input<string>? SparkVersion { get; set; }

        public GetSparkVersionInvokeArgs()
        {
        }
        public static new GetSparkVersionInvokeArgs Empty => new GetSparkVersionInvokeArgs();
    }


    [OutputType]
    public sealed class GetSparkVersionResult
    {
        public readonly bool? Beta;
        public readonly bool? Genomics;
        public readonly bool? Gpu;
        public readonly bool? Graviton;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? Latest;
        public readonly bool? LongTermSupport;
        public readonly bool? Ml;
        public readonly bool? Photon;
        public readonly string? Scala;
        public readonly string? SparkVersion;

        [OutputConstructor]
        private GetSparkVersionResult(
            bool? beta,

            bool? genomics,

            bool? gpu,

            bool? graviton,

            string id,

            bool? latest,

            bool? longTermSupport,

            bool? ml,

            bool? photon,

            string? scala,

            string? sparkVersion)
        {
            Beta = beta;
            Genomics = genomics;
            Gpu = gpu;
            Graviton = graviton;
            Id = id;
            Latest = latest;
            LongTermSupport = longTermSupport;
            Ml = ml;
            Photon = photon;
            Scala = scala;
            SparkVersion = sparkVersion;
        }
    }
}
