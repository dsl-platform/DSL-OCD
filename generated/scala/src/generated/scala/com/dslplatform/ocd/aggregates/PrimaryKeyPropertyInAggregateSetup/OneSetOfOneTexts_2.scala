package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneTexts_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfOneTexts: Set[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneTexts_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneTexts_2("+ URI +")"

   def copy(oneSetOfOneTexts: Set[String] = this._oneSetOfOneTexts): OneSetOfOneTexts_2 = {

  require(oneSetOfOneTexts ne null, "Null value was provided for property \"oneSetOfOneTexts\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneTexts)
    new OneSetOfOneTexts_2(_URI = this.URI, __locator = this.__locator, _oneSetOfOneTexts = oneSetOfOneTexts)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneTexts_2): this.type = {
    this._URI = result._URI
    this._oneSetOfOneTexts = result._oneSetOfOneTexts
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneTexts_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfOneTexts")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneTexts = {
    _oneSetOfOneTexts
  }

  def oneSetOfOneTexts_= (value: Set[String]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneTexts") oneSetOfOneTexts: Set[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfOneTexts = if (oneSetOfOneTexts == null) Set.empty else oneSetOfOneTexts)

}

object OneSetOfOneTexts_2 extends AggregateRootCompanion[OneSetOfOneTexts_2]{

  def apply(
    oneSetOfOneTexts: Set[String] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneTexts)
    require(oneSetOfOneTexts ne null, "Null value was provided for property \"oneSetOfOneTexts\"")
    new OneSetOfOneTexts_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfOneTexts = oneSetOfOneTexts)
  }

}
