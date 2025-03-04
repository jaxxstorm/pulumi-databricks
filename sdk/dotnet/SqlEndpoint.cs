// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// This resource is used to manage [Databricks SQL Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html). To create [SQL endpoints](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricks_sql_access` on your databricks.Group or databricks_user.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var me = Databricks.GetCurrentUser.Invoke();
    /// 
    ///     var @this = new Databricks.SqlEndpoint("this", new()
    ///     {
    ///         ClusterSize = "Small",
    ///         MaxNumClusters = 1,
    ///         Tags = new Databricks.Inputs.SqlEndpointTagsArgs
    ///         {
    ///             CustomTags = new[]
    ///             {
    ///                 new Databricks.Inputs.SqlEndpointTagsCustomTagArgs
    ///                 {
    ///                     Key = "City",
    ///                     Value = "Amsterdam",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Access Control
    /// 
    /// * databricks.Permissions can control which groups or individual users can *Can Use* or *Can Manage* SQL endpoints.
    /// * `databricks_sql_access` on databricks.Group or databricks_user.
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
    /// * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
    /// * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace.
    /// * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
    /// 
    /// ## Import
    /// 
    /// You can import a `databricks_sql_endpoint` resource with ID like the followingbash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/sqlEndpoint:SqlEndpoint this &lt;endpoint-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/sqlEndpoint:SqlEndpoint")]
    public partial class SqlEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Time in minutes until an idle SQL endpoint terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
        /// </summary>
        [Output("autoStopMins")]
        public Output<int?> AutoStopMins { get; private set; } = null!;

        /// <summary>
        /// block, consisting of following fields:
        /// </summary>
        [Output("channel")]
        public Output<Outputs.SqlEndpointChannel?> Channel { get; private set; } = null!;

        /// <summary>
        /// The size of the clusters allocated to the endpoint: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
        /// </summary>
        [Output("clusterSize")]
        public Output<string> ClusterSize { get; private set; } = null!;

        /// <summary>
        /// ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
        /// </summary>
        [Output("dataSourceId")]
        public Output<string> DataSourceId { get; private set; } = null!;

        /// <summary>
        /// Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
        /// </summary>
        [Output("enablePhoton")]
        public Output<bool?> EnablePhoton { get; private set; } = null!;

        /// <summary>
        /// Whether this SQL endpoint is a Serverless endpoint. To use a Serverless SQL endpoint, you must enable Serverless SQL endpoints for the workspace.
        /// </summary>
        [Output("enableServerlessCompute")]
        public Output<bool?> EnableServerlessCompute { get; private set; } = null!;

        [Output("instanceProfileArn")]
        public Output<string?> InstanceProfileArn { get; private set; } = null!;

        /// <summary>
        /// JDBC connection string.
        /// </summary>
        [Output("jdbcUrl")]
        public Output<string> JdbcUrl { get; private set; } = null!;

        /// <summary>
        /// Maximum number of clusters available when a SQL endpoint is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
        /// </summary>
        [Output("maxNumClusters")]
        public Output<int?> MaxNumClusters { get; private set; } = null!;

        /// <summary>
        /// Minimum number of clusters available when a SQL endpoint is running. The default is `1`.
        /// </summary>
        [Output("minNumClusters")]
        public Output<int?> MinNumClusters { get; private set; } = null!;

        /// <summary>
        /// Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("numClusters")]
        public Output<int?> NumClusters { get; private set; } = null!;

        /// <summary>
        /// ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
        /// </summary>
        [Output("odbcParams")]
        public Output<Outputs.SqlEndpointOdbcParams> OdbcParams { get; private set; } = null!;

        /// <summary>
        /// The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
        /// </summary>
        [Output("spotInstancePolicy")]
        public Output<string?> SpotInstancePolicy { get; private set; } = null!;

        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Databricks tags all endpoint resources with these tags.
        /// </summary>
        [Output("tags")]
        public Output<Outputs.SqlEndpointTags?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a SqlEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SqlEndpoint(string name, SqlEndpointArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/sqlEndpoint:SqlEndpoint", name, args ?? new SqlEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SqlEndpoint(string name, Input<string> id, SqlEndpointState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/sqlEndpoint:SqlEndpoint", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SqlEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SqlEndpoint Get(string name, Input<string> id, SqlEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new SqlEndpoint(name, id, state, options);
        }
    }

    public sealed class SqlEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time in minutes until an idle SQL endpoint terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
        /// </summary>
        [Input("autoStopMins")]
        public Input<int>? AutoStopMins { get; set; }

        /// <summary>
        /// block, consisting of following fields:
        /// </summary>
        [Input("channel")]
        public Input<Inputs.SqlEndpointChannelArgs>? Channel { get; set; }

        /// <summary>
        /// The size of the clusters allocated to the endpoint: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
        /// </summary>
        [Input("clusterSize", required: true)]
        public Input<string> ClusterSize { get; set; } = null!;

        /// <summary>
        /// ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
        /// </summary>
        [Input("dataSourceId")]
        public Input<string>? DataSourceId { get; set; }

        /// <summary>
        /// Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
        /// </summary>
        [Input("enablePhoton")]
        public Input<bool>? EnablePhoton { get; set; }

        /// <summary>
        /// Whether this SQL endpoint is a Serverless endpoint. To use a Serverless SQL endpoint, you must enable Serverless SQL endpoints for the workspace.
        /// </summary>
        [Input("enableServerlessCompute")]
        public Input<bool>? EnableServerlessCompute { get; set; }

        [Input("instanceProfileArn")]
        public Input<string>? InstanceProfileArn { get; set; }

        /// <summary>
        /// JDBC connection string.
        /// </summary>
        [Input("jdbcUrl")]
        public Input<string>? JdbcUrl { get; set; }

        /// <summary>
        /// Maximum number of clusters available when a SQL endpoint is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
        /// </summary>
        [Input("maxNumClusters")]
        public Input<int>? MaxNumClusters { get; set; }

        /// <summary>
        /// Minimum number of clusters available when a SQL endpoint is running. The default is `1`.
        /// </summary>
        [Input("minNumClusters")]
        public Input<int>? MinNumClusters { get; set; }

        /// <summary>
        /// Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("numClusters")]
        public Input<int>? NumClusters { get; set; }

        /// <summary>
        /// ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
        /// </summary>
        [Input("odbcParams")]
        public Input<Inputs.SqlEndpointOdbcParamsArgs>? OdbcParams { get; set; }

        /// <summary>
        /// The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
        /// </summary>
        [Input("spotInstancePolicy")]
        public Input<string>? SpotInstancePolicy { get; set; }

        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Databricks tags all endpoint resources with these tags.
        /// </summary>
        [Input("tags")]
        public Input<Inputs.SqlEndpointTagsArgs>? Tags { get; set; }

        public SqlEndpointArgs()
        {
        }
        public static new SqlEndpointArgs Empty => new SqlEndpointArgs();
    }

    public sealed class SqlEndpointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time in minutes until an idle SQL endpoint terminates all clusters and stops. This field is optional. The default is 120, set to 0 to disable the auto stop.
        /// </summary>
        [Input("autoStopMins")]
        public Input<int>? AutoStopMins { get; set; }

        /// <summary>
        /// block, consisting of following fields:
        /// </summary>
        [Input("channel")]
        public Input<Inputs.SqlEndpointChannelGetArgs>? Channel { get; set; }

        /// <summary>
        /// The size of the clusters allocated to the endpoint: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
        /// </summary>
        [Input("clusterSize")]
        public Input<string>? ClusterSize { get; set; }

        /// <summary>
        /// ID of the data source for this endpoint. This is used to bind an Databricks SQL query to an endpoint.
        /// </summary>
        [Input("dataSourceId")]
        public Input<string>? DataSourceId { get; set; }

        /// <summary>
        /// Whether to enable [Photon](https://databricks.com/product/delta-engine). This field is optional and is enabled by default.
        /// </summary>
        [Input("enablePhoton")]
        public Input<bool>? EnablePhoton { get; set; }

        /// <summary>
        /// Whether this SQL endpoint is a Serverless endpoint. To use a Serverless SQL endpoint, you must enable Serverless SQL endpoints for the workspace.
        /// </summary>
        [Input("enableServerlessCompute")]
        public Input<bool>? EnableServerlessCompute { get; set; }

        [Input("instanceProfileArn")]
        public Input<string>? InstanceProfileArn { get; set; }

        /// <summary>
        /// JDBC connection string.
        /// </summary>
        [Input("jdbcUrl")]
        public Input<string>? JdbcUrl { get; set; }

        /// <summary>
        /// Maximum number of clusters available when a SQL endpoint is running. This field is required. If multi-cluster load balancing is not enabled, this is default to `1`.
        /// </summary>
        [Input("maxNumClusters")]
        public Input<int>? MaxNumClusters { get; set; }

        /// <summary>
        /// Minimum number of clusters available when a SQL endpoint is running. The default is `1`.
        /// </summary>
        [Input("minNumClusters")]
        public Input<int>? MinNumClusters { get; set; }

        /// <summary>
        /// Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("numClusters")]
        public Input<int>? NumClusters { get; set; }

        /// <summary>
        /// ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
        /// </summary>
        [Input("odbcParams")]
        public Input<Inputs.SqlEndpointOdbcParamsGetArgs>? OdbcParams { get; set; }

        /// <summary>
        /// The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`. This field is optional. Default is `COST_OPTIMIZED`.
        /// </summary>
        [Input("spotInstancePolicy")]
        public Input<string>? SpotInstancePolicy { get; set; }

        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Databricks tags all endpoint resources with these tags.
        /// </summary>
        [Input("tags")]
        public Input<Inputs.SqlEndpointTagsGetArgs>? Tags { get; set; }

        public SqlEndpointState()
        {
        }
        public static new SqlEndpointState Empty => new SqlEndpointState();
    }
}
