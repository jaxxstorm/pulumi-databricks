// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoAutoscaleArgs : global::Pulumi.InvokeArgs
    {
        [Input("maxWorkers")]
        public int? MaxWorkers { get; set; }

        [Input("minWorkers")]
        public int? MinWorkers { get; set; }

        public GetClusterClusterInfoAutoscaleArgs()
        {
        }
        public static new GetClusterClusterInfoAutoscaleArgs Empty => new GetClusterClusterInfoAutoscaleArgs();
    }
}