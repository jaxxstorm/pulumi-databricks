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
    /// This resource allows you to create [MLflow Model Registry Webhooks](https://docs.databricks.com/applications/mlflow/model-registry-webhooks.html) in Databricks.  Webhooks enable you to listen for Model Registry events so your integrations can automatically trigger actions. You can use webhooks to automate and integrate your machine learning pipeline with existing CI/CD tools and workflows. Webhooks allow trigger execution of a Databricks job or call a web service on specific event(s) that is generated in the MLflow Registry - stage transitioning, creation of registered model, creation of transition request, etc.
    /// 
    /// ## Example Usage
    /// ### POSTing to URL
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var url = new Databricks.MlflowWebhook("url", new()
    ///     {
    ///         Description = "URL webhook trigger",
    ///         Events = new[]
    ///         {
    ///             "TRANSITION_REQUEST_CREATED",
    ///         },
    ///         HttpUrlSpec = new Databricks.Inputs.MlflowWebhookHttpUrlSpecArgs
    ///         {
    ///             Url = "https://my_cool_host/webhook",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Access Control
    /// 
    /// * MLflow webhooks could be configured only by workspace admins.
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
    /// * databricks.MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
    /// * databricks.MlflowModel to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.
    /// * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
    /// * databricks.Notebook data to export a notebook from Databricks Workspace.
    /// * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/mlflowWebhook:MlflowWebhook")]
    public partial class MlflowWebhook : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Optional description of the MLflow webhook.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
        /// </summary>
        [Output("events")]
        public Output<ImmutableArray<string>> Events { get; private set; } = null!;

        [Output("httpUrlSpec")]
        public Output<Outputs.MlflowWebhookHttpUrlSpec?> HttpUrlSpec { get; private set; } = null!;

        [Output("jobSpec")]
        public Output<Outputs.MlflowWebhookJobSpec?> JobSpec { get; private set; } = null!;

        /// <summary>
        /// Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
        /// </summary>
        [Output("modelName")]
        public Output<string?> ModelName { get; private set; } = null!;

        /// <summary>
        /// Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;


        /// <summary>
        /// Create a MlflowWebhook resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MlflowWebhook(string name, MlflowWebhookArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mlflowWebhook:MlflowWebhook", name, args ?? new MlflowWebhookArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MlflowWebhook(string name, Input<string> id, MlflowWebhookState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mlflowWebhook:MlflowWebhook", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MlflowWebhook resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MlflowWebhook Get(string name, Input<string> id, MlflowWebhookState? state = null, CustomResourceOptions? options = null)
        {
            return new MlflowWebhook(name, id, state, options);
        }
    }

    public sealed class MlflowWebhookArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional description of the MLflow webhook.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("events", required: true)]
        private InputList<string>? _events;

        /// <summary>
        /// The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
        /// </summary>
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        [Input("httpUrlSpec")]
        public Input<Inputs.MlflowWebhookHttpUrlSpecArgs>? HttpUrlSpec { get; set; }

        [Input("jobSpec")]
        public Input<Inputs.MlflowWebhookJobSpecArgs>? JobSpec { get; set; }

        /// <summary>
        /// Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
        /// </summary>
        [Input("modelName")]
        public Input<string>? ModelName { get; set; }

        /// <summary>
        /// Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public MlflowWebhookArgs()
        {
        }
        public static new MlflowWebhookArgs Empty => new MlflowWebhookArgs();
    }

    public sealed class MlflowWebhookState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional description of the MLflow webhook.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("events")]
        private InputList<string>? _events;

        /// <summary>
        /// The list of events that will trigger execution of Databricks job or POSTing to an URL, for example, `MODEL_VERSION_CREATED`, `MODEL_VERSION_TRANSITIONED_STAGE`, `TRANSITION_REQUEST_CREATED`, etc.  Refer to the [Webhooks API documentation](https://docs.databricks.com/dev-tools/api/latest/mlflow.html#operation/create-registry-webhook) for a full list of supported events.
        /// </summary>
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        [Input("httpUrlSpec")]
        public Input<Inputs.MlflowWebhookHttpUrlSpecGetArgs>? HttpUrlSpec { get; set; }

        [Input("jobSpec")]
        public Input<Inputs.MlflowWebhookJobSpecGetArgs>? JobSpec { get; set; }

        /// <summary>
        /// Name of MLflow model for which webhook will be created. If the model name is not specified, a registry-wide webhook is created that listens for the specified events across all versions of all registered models.
        /// </summary>
        [Input("modelName")]
        public Input<string>? ModelName { get; set; }

        /// <summary>
        /// Optional status of webhook. Possible values are `ACTIVE`, `TEST_MODE`, `DISABLED`. Default is `ACTIVE`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public MlflowWebhookState()
        {
        }
        public static new MlflowWebhookState Empty => new MlflowWebhookState();
    }
}
