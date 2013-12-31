package com.dslplatform.ocd.aggregates.SetBinaryInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetBinaryAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setBinary: Set[Array[Byte]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetBinaryInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetBinaryAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetBinaryAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetBinaryInAggregate.SetBinaryAggregate): this.type = {
    this.URI = result.URI;
    this._setBinary = result._setBinary;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetBinaryInAggregate.SetBinaryAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setBinary")
  def setBinary = {
    _setBinary
  }

  def setBinary_= (value: Set[Array[Byte]]) {
    _setBinary = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setBinary") setBinary: Set[Array[Byte]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setBinary = if (setBinary == null) Set.empty else setBinary)

}

object SetBinaryAggregate extends AggregateRootCompanion[SetBinaryAggregate]{

  def apply(
    setBinary: Set[Array[Byte]] = Set.empty
  ) = {
    new SetBinaryAggregate(
      _locator = None
    , _URI = null
    , _setBinary = setBinary)
  }

}
