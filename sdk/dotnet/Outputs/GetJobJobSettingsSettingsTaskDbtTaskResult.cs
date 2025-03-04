// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetJobJobSettingsSettingsTaskDbtTaskResult
    {
        public readonly ImmutableArray<string> Commands;
        public readonly string? ProfilesDirectory;
        public readonly string? ProjectDirectory;
        public readonly string? Schema;
        public readonly string? WarehouseId;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskDbtTaskResult(
            ImmutableArray<string> commands,

            string? profilesDirectory,

            string? projectDirectory,

            string? schema,

            string? warehouseId)
        {
            Commands = commands;
            ProfilesDirectory = profilesDirectory;
            ProjectDirectory = projectDirectory;
            Schema = schema;
            WarehouseId = warehouseId;
        }
    }
}
