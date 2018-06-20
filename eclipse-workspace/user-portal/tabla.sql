/*    ==Scripting Parameters==

    Source Server Version : SQL Server 2005 (9.0.5266)
    Source Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Source Database Engine Type : Standalone SQL Server

    Target Server Version : SQL Server 2005
    Target Database Engine Edition : Microsoft SQL Server Enterprise Edition
    Target Database Engine Type : Standalone SQL Server
*/

USE [testdb]
GO

/****** Object:  Table [dbo].[USERDEMO]    Script Date: 29/05/2018 11:52:48 a. m. ******/
DROP TABLE [dbo].[USERDEMO]
GO

/****** Object:  Table [dbo].[USERDEMO]    Script Date: 29/05/2018 11:52:48 a. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[USERDEMO](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[first_name] [nchar](10) NULL,
	[last_name] [nchar](10) NULL,
	[email] [nchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


