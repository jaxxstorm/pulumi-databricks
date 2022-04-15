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
    public sealed class SqlQuerySchedule
    {
        public readonly Outputs.SqlQueryScheduleContinuous? Continuous;
        public readonly Outputs.SqlQueryScheduleDaily? Daily;
        public readonly Outputs.SqlQueryScheduleWeekly? Weekly;

        [OutputConstructor]
        private SqlQuerySchedule(
            Outputs.SqlQueryScheduleContinuous? continuous,

            Outputs.SqlQueryScheduleDaily? daily,

            Outputs.SqlQueryScheduleWeekly? weekly)
        {
            Continuous = continuous;
            Daily = daily;
            Weekly = weekly;
        }
    }
}