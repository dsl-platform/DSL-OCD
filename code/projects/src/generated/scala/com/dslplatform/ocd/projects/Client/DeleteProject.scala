package com.dslplatform.ocd.projects.Client

import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

import org.joda.time.DateTime
import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import com.fasterxml.jackson.annotation._

case class DeleteProject private(
    @JsonProperty("URI")private val _URI: String,
    @JsonProperty("CreatedAt")private val _createdAt: DateTime,
    @JsonProperty("ProcessedAt")private val _processedAt: Option[DateTime],
    @JsonProperty("Project")private val _Project: String
  ) extends java.io.Serializable with DomainEvent {

  val URI: String = if (_URI != null) _URI else java.util.UUID.randomUUID.toString
  val createdAt: DateTime = if (_createdAt != null) _createdAt else DateTime.now
  val processedAt: Option[DateTime] = if (_processedAt != null) _processedAt else None

  override def hashCode() = URI.hashCode

  override def equals(obj: Any): Boolean = {
    if (this == obj)
      return true
    if (obj == null)
      return false
    if (getClass() != obj.getClass())
      return false
    val other = obj.asInstanceOf[DeleteProject]
    URI != null && URI.equals(other.URI)
  }

  override def toString() = "DeleteProject(" + URI + ')'

  private val serialVersionUID: Long = 0x0097000a

   def copy(Project: String = this.Project): DeleteProject = {

  require(Project ne null, "Null value was provided for property \"Project\"")
    new DeleteProject(_URI = this.URI, _createdAt = this.createdAt, _processedAt = this.processedAt, _Project = Project)
  }

  def submit()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): String = {
    Await.result(Option(locator).getOrElse(Bootstrap.getLocator).resolve(classOf[DomainProxy]).submit(this), duration)
  }
  val Project: String = if (_Project != null) _Project else ""
}

object DeleteProject{

  def apply(Project: String = "") = {

  require(Project ne null, "Null value was provided for property \"Project\"")
  new DeleteProject(_URI = java.util.UUID.randomUUID.toString, _createdAt = DateTime.now, _processedAt = None , _Project = Project)
  }
}
