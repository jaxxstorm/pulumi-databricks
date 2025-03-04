// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskNotebookTaskGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("baseParameters")]
        private InputMap<object>? _baseParameters;

        /// <summary>
        /// (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
        /// </summary>
        public InputMap<object> BaseParameters
        {
            get => _baseParameters ?? (_baseParameters = new InputMap<object>());
            set => _baseParameters = value;
        }

        /// <summary>
        /// The absolute path of the databricks.Notebook to be run in the Databricks workspace. This path must begin with a slash. This field is required.
        /// </summary>
        [Input("notebookPath", required: true)]
        public Input<string> NotebookPath { get; set; } = null!;

        public JobTaskNotebookTaskGetArgs()
        {
        }
        public static new JobTaskNotebookTaskGetArgs Empty => new JobTaskNotebookTaskGetArgs();
    }
}
