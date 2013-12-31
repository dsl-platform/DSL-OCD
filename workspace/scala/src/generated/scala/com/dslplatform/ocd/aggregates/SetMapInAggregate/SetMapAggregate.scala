package com.dslplatform.ocd.aggregates.SetMapInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetMapAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setMap: Set[Map[String, String]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetMapInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetMapAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetMapAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetMapInAggregate.SetMapAggregate): this.type = {
    this.URI = result.URI;
    this._setMap = result._setMap;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetMapInAggregate.SetMapAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setMap")
  def setMap = {
    _setMap
  }

  def setMap_= (value: Set[Map[String, String]]) {
    _setMap = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setMap") setMap: Set[Map[String, String]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setMap = if (setMap == null) Set.empty else setMap)

}

object SetMapAggregate extends AggregateRootCompanion[SetMapAggregate]{

  def apply(
    setMap: Set[Map[String, String]] = Set.empty
  ) = {
    new SetMapAggregate(
      _locator = None
    , _URI = null
    , _setMap = setMap)
  }

}
